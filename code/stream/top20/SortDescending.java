package code.stream.top20;

import java.util.*;

public class SortDescending {

	// 10. Given a list of integers, sort all the values present in it in descending
	// order using Stream functions?
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e + " "));
	}

}
