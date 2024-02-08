package code.stream.javatechie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyInString {

	public static void main(String[] args) {

		String input = "bookkeeper";

		// Without order
		Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().forEach(System.out::print);
		
		System.out.println("\n------");
		
		input.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(e->System.out.print(e+" "));

		System.out.println("\n------");
		input.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).forEach(e -> System.out.print(e + " "));
		;
		
		// With Order
		Stream.of(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().forEach(System.out::print);

		System.out.println("\n------");
		// Alphabetic order
		Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::print);

		System.out.println("\n------");
		// charactersInOrderOfMostOccurring
		Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.compareTo(o1))).forEach(e->System.out.println(e+" "));


		// Q1
		String input2 = "samitverma";
		Arrays.stream(input2.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().forEach(System.out::println);

		// Q2
		List<Employee> employees = Stream.of(new Employee(1, "Samit", "DEV", 50000),
				new Employee(8, "Abhishek", "DEV", 100000), new Employee(3, "Deepak", "QA", 770000),
				new Employee(9, "Aman", "QA", 8270000), new Employee(4, "Ayush", "DEVOPS", 8850000))
				.collect(Collectors.toList());
		// Approach1
		Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
		Map<String, Employee> highestSalaryMap = new HashMap<String, Employee>();
		map.entrySet().stream().forEach(entry -> {
			List<Employee> employeeList = entry.getValue();
			Employee emp = employeeList.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary()).findFirst().get();
			highestSalaryMap.put(entry.getKey(), emp);
		});
		//System.out.println(highestSalaryMap);

		// Approach2
		Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
		Map<String, Optional<Employee>> highestSalaryMap2 = employees.stream().collect(
				Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(compareBySalary))));
		System.out.println(highestSalaryMap2);

		// Approach3
		Map<String, Long> deptMap = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		//System.out.println(deptMap);
	}

	static class Employee {
		int id;
		String employeeName;
		String dept;
		int salary;

		public Employee(int id, String employeeName, String dept, int salary) {
			super();
			this.id = id;
			this.employeeName = employeeName;
			this.dept = dept;
			this.salary = salary;
		}

		public Employee() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", employeeName=" + employeeName + ", dept=" + dept + ", salary=" + salary
					+ "]";
		}

	}

}
