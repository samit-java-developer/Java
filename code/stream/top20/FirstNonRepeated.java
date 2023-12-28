package code.stream.top20;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class FirstNonRepeated {

	// 7. Given a String, find the first non-repeated character in it using Stream
	// functions?
	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		Character result = input.chars().mapToObj(s -> Character.valueOf((char) s))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();

		System.out.println(result);

		// second way
		// String result1=Stream.of(input.split(""))
		// .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new
		// ,Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1L).map(e->e.getKey()).findFirst().get();

		String result1 = Stream.of(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1L).map(e -> e.getKey()).findFirst().get();

		System.out.println(result1);

		Character result2 = input.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
																					// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
																												// the
																												// chars
																												// in
																												// map
																												// with
																												// count
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result2);
	}

}
