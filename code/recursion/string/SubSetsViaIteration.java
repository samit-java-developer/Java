package code.recursion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsViaIteration {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		System.out.println(getAllSubSetsInDuplicate(arr));
	}

	static List<List<Integer>> getAllSubSets(List<Integer> list) {
		List<List<Integer>> outer = new ArrayList<List<Integer>>();
		outer.add(new ArrayList<Integer>());
		for (Integer x : list) {
			List<List<Integer>> copiedList = new ArrayList<List<Integer>>();
			for (List<Integer> innerList : outer) {
				List<Integer> copiedInnerList = new ArrayList<>(innerList);
				copiedList.add(copiedInnerList);
			}
			// List<List<Integer>> copiedList = outer.stream().collect(Collectors.toList());
			for (List<Integer> innerList : copiedList) {
				innerList.add(x);
			}
			outer.addAll(copiedList);
		}
		return outer;
	}

	static List<List<Integer>> getAllSubSetsInDuplicate(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> outer = new ArrayList<List<Integer>>();
		outer.add(new ArrayList<Integer>());
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				start = end + 1;
			} else {
				start = 0;
			}
			end = outer.size() - 1;
			for (int j = start; j <= end; j++) {
				List<Integer> innerList = new ArrayList<Integer>(outer.get(j));
				innerList.add(arr[i]);
				outer.add(innerList);
			}
		}
		return outer;
	}

}
