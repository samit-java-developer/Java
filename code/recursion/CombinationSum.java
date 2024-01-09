package code.recursion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> result = new ArrayList<>();
		return combinationSumSub(result, candidates, 0, candidates.length, target);
	}

	public static List<List<Integer>> combinationSumSub(List<Integer> result, int[] candidates, int index, int n,
			int target) {
		List<List<Integer>> list = new ArrayList<>();
		if (index == n) {
			int total = result.stream().reduce(0, Integer::sum);
			if (total == target) {
				list.add(result);
			}
			return list;
		}
		int element = candidates[index];
		List<Integer> leftTemp = new ArrayList<>(result);
		List<Integer> rightTemp = new ArrayList<>(result);
		rightTemp.add(element);
		List<List<Integer>> left = combinationSumSub(leftTemp, candidates, index + 1, n, target);
		List<List<Integer>> right = combinationSumSub(rightTemp, candidates, index + 1, n, target);
		left.addAll(right);
		return left;
	}

	public static void printAllCombinations(String result, int[] candidates, int target) {
		if (target == 0) {
			System.out.println(result);
			return;
		}
		for (int i = 0; i < candidates.length && candidates[i] <= target; i++) {
			if (result.length() >= 1) {
				char ch = result.charAt(result.length() - 1);
				int no = Integer.parseInt(ch + "");
				if (no > candidates[i]) {
					return;
				}
			}
			printAllCombinations(result + candidates[i], candidates, target - candidates[i]);
		}
	}

	public static List<List<Integer>> printAllCombinationsReturn(String result, int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (target == 0) {
			list.add(Stream.of(result.split("")).map(e -> Integer.parseInt(e)).collect(Collectors.toList()));
			return list;
		}
		for (int i = 0; i < candidates.length && candidates[i] <= target; i++) {
			if (result.length() >= 1) {
				char ch = result.charAt(result.length() - 1);
				int no = Integer.parseInt(ch + "");
				if (no > candidates[i]) {
					continue;
				}
			}
			list.addAll(printAllCombinationsReturn(result + candidates[i], candidates, target - candidates[i]));
		}
		return list;
	}

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		System.out.println(printAllCombinationsReturn("", candidates, target));

	}

}
