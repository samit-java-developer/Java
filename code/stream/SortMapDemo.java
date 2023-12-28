package code.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		// sort the map via key

		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();

		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(e -> sortedMap.put(e.getKey(), e.getValue()));

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e));

		System.out.println(sortedMap);

	}

}
