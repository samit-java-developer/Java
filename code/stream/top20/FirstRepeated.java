package code.stream.top20;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeated {

	// 8. Given a String, find the first repeated character in it using Stream
	// functions?
	public static void main(String[] args) {
		
		String input = "Java Articles are Awesome";
		Map<Character, Long> map=input.chars()
		     .mapToObj(e->Character.valueOf((char)e))
		     .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		
		Character result=map.entrySet()
				            .stream()
				            .filter(entry->entry.getValue()>1)
				            .map(entry->entry.getKey())
				            .findFirst()
				            .get();
				
		System.out.println(result);
	}

}
