package code.stream.top20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortValues {

	// 9. Given a list of integers, sort all the values present in it using Stream
	// functions?
	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().sorted().forEach(e -> System.out.print(e + " "));
		
	
	}

}
