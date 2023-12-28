package code.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Student {

	private Integer id;

	private String name;

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

public class GroupingBy {

	public static void main(String[] args) {
		List<Student> lt = new ArrayList<Student>();

		// add the member of list
		lt.add(new Student(1, "Geeks"));
		lt.add(new Student(1, "For"));
		lt.add(new Student(2, "Geeks"));
		lt.add(new Student(2, "GeeksForGeeks"));

		Map<Integer, Set<String>> multimap = lt.stream().collect(
				Collectors.groupingBy(Student::getId, Collectors.mapping(Student::getName, Collectors.toSet())));
		
		Map<Integer, List<String>> multimap2 = lt.stream().collect(
				Collectors.groupingBy(Student::getId, Collectors.mapping(Student::getName, Collectors.toList())));

		multimap.forEach((x, y) -> System.out.println(x + " -> " + y.toString()));
	}

}
