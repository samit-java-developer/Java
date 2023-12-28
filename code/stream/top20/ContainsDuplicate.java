package code.stream.top20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		List<Integer> list = Arrays.stream(nums).mapToObj(e -> Integer.valueOf((int) e)).collect(Collectors.toList());

		Set<Integer> sets = new HashSet<Integer>(list);
		if (list.size() == sets.size()) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		
		Map<Integer, Long> maps=list.stream().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		System.out.println(maps);
	}

}
