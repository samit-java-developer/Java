package code.stream.top20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

	// 3. How to find duplicate elements in a given integers list in java using
	// Stream functions?
	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet<Integer>();
		myList.stream().filter(e -> !set.add(e)).forEach(e -> System.out.print(e + " "));

		System.out.println();
		// second way

		myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).forEach(e -> System.out.print(e.getKey() + " "));

		System.out.println();
		long count = myList.stream().count();
		System.out.println(count);

		System.out.println();
		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
	}

}
