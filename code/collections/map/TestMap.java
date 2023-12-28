package code.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// comparing byKey
		//put()
		//putIfAbsent()
		//putAll()
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.filter(e -> e.getKey() > 100).forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).filter(e -> e.getKey() > 100)
				.forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).filter(e -> e.getKey() > 100)
				.forEach(System.out::println);
		
		for (Map.Entry<Integer, String> e:map.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}

	}

}
