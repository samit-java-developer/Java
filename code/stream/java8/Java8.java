package code.stream.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8 {

	//Q1-: Given a list of integers, separate odd and even numbers?
	//Q2-: How do you remove duplicate elements from a list using Java 8 streams?
	//Q3-: How do you find frequency of each character in a string using Java 8 streams?
	//Q4-: How do you sort the given list of decimals in reverse order?
	//Q6-: Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
	
	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		// listOfIntegers.stream().filter(i->i%2==0).collect(Collectors.toList());
		Map<Boolean, List<Integer>> oddAndEven = listOfIntegers.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		oddAndEven.entrySet().stream().forEach(e -> System.out.println(e));
		
		System.out.println("-----------------------------------------");
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "JAva", "Kotlin", "Python");
        List<String> uniqueStrngs = listOfStrings.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(uniqueStrngs);
        
        System.out.println("-----------------------------------------");
        
        String inputString="Java Concept Of The Day";
        Map<Character, Long> charCountMap =inputString.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);
        
        System.out.println("-----------------------------------------");
        
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		decimalList.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));
		
		System.out.println("-----------------------------------------");
		List<String> listOfStrings1 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        
        String joinedString = listOfStrings1.stream().collect(Collectors.joining(",", "[", "]"));
         
        System.out.println(joinedString);
        
        System.out.println("-----------------------------------------");
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};
         
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
	}

}
