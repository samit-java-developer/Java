package code.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListIntoMap {

	public static void main(String[] args) {

		Product p1 = new Product(1, "Gmail", 10000);
		Product p2 = new Product(2, "Gmap", 10000);
		Product p3 = new Product(3, "Gdrive", 10000);
		Product p4 = new Product(4, "Youtube", 10000);

		List<Product> productList = new ArrayList<Product>();
		productList.addAll(List.of(p1, p2, p3, p4));
		Map<Integer, String> maps = productList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		maps.forEach((x, y) -> System.out.print(x + "->" + y + " , "));
		
		System.out.println();

		maps.entrySet().forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));
	}

	static class Product {
		int id;
		String name;
		int salary;

		public Product(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
	}

}
