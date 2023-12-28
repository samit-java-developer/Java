package code.stream.top20;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntoUpperCase {
	public static void main(String[] args) {
		List<String> names = List.of("aa", "bb", "cc");
		List<String> nameLst = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(nameLst);
	}
}
