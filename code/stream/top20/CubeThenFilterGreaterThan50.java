package code.stream.top20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeThenFilterGreaterThan50 {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		integerList.stream()
		           .map(e -> e * e * e)
		           .filter(e -> e > 50)
		           .collect(Collectors.toList())
				   .forEach(e -> System.out.print(e + " "));

	}

}
