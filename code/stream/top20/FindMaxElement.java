package code.stream.top20;

import java.util.*;

public class FindMaxElement {

	// 6. Given a list of integers, find the maximum value element present in it
	// using Stream functions?
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		//First Way
		int max = myList.stream().max((o1, o2) -> {
			return o1 - o2;
		}).get();
		System.out.println(max);
		
		//Second Way
		int max2 = myList.stream().max(Integer::compare).get();
		System.out.println(max2);
	}

}
