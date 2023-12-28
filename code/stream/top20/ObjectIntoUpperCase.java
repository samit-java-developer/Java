package code.stream.top20;

import java.util.List;
import java.util.stream.Collectors;

public class ObjectIntoUpperCase {
//16. How to use map to convert object into Uppercase in Java 8?
	public static void main(String[] args) {

		List<String> list = List.of("aa", "bb", "cc", "dd");
		List<String> nameList = list.stream()
				                   .map(String::toUpperCase)
				                   .collect(Collectors.toList());
		System.out.println(nameList);
	}

}
