package code.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class RealTimeCodingInterviewQuestion {

	static List<Employee> employeeList = new ArrayList<Employee>();
	static {
		System.out.println("Employee loading started.....");

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		System.out.println("Employee loading ended....");
	}

	public static void getCountOfMaleFemale(List<Employee> employeeList) {
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);
	}

	public static void getDepartmentName(List<Employee> employeeList) {
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(e -> System.out.println(e + ", "));

	}

	public static void getTheAvergaeAgeOfFemaleAndMale(List<Employee> employeeList) {
		Map<String, Double> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(map);
	}

	public static void getTheNameOfEmployeeAfter2015(List<Employee> employeeList) {
		Set<String> namesOfEmployee = employeeList.stream().filter(e -> e.getYearOfJoining() >= 2015)
				.map(e -> e.getName()).collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(namesOfEmployee);
	}

	public static void getOldestEmployee(List<Employee> employeeList) {
		Optional<Employee> oldestEmployee = employeeList.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge())
				.findFirst();

		System.out.println("Name : " + oldestEmployee.get().getName());
		System.out.println("Age : " + oldestEmployee.get().getAge());
		System.out.println("Department : " + oldestEmployee.get().getDepartment());

	}

	// *****
	public static void getTotalAndAverageSalary(List<Employee> employeeList) {
		DoubleSummaryStatistics empSalary = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary = " + empSalary.getAverage());
		System.out.println("Total Salary = " + empSalary.getSum());
	}

	public static void getHighestExperiencedEmployee(List<Employee> employeeList) {
//		Optional<Employee> seniorEmp = employeeList.stream()
//				.sorted((o1, o2) -> (int) (o1.getYearOfJoining() - o2.getYearOfJoining())).findFirst();
//		
//		
		Optional<Employee> seniorEmp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
				.findFirst();

		System.out.println(seniorEmp.get());
	}

	public static void main(String[] args) {

		System.out.println("-------------------------------------\n");
		System.out.println("Get Count of Male and Female-:");
		getCountOfMaleFemale(employeeList);

		System.out.println("-------------------------------------\n");
		System.out.println("Department Name-: ");
		getDepartmentName(employeeList);
		System.out.println("-------------------------------------\n");

		System.out.println("Average age of Male and Female....");
		getTheAvergaeAgeOfFemaleAndMale(employeeList);
		System.out.println("-------------------------------------\n");

		System.out.println("Get the Names of employees who joined after 2015.");
		getTheNameOfEmployeeAfter2015(employeeList);
		System.out.println("-------------------------------------\n");

		System.out.println("Find out the oldest employee, his/her age and department");
		getOldestEmployee(employeeList);
		System.out.println("-------------------------------------\n");

		System.out.println("Find out the average and total salary of the organization.");
		getTotalAndAverageSalary(employeeList);
		System.out.println("-------------------------------------\n");
		
		
		System.out.println("Find out the highest experienced employees in the organization");
		getHighestExperiencedEmployee(employeeList);
		System.out.println("-------------------------------------\n");
	}

	static class Employee {
		int id;
		String name;
		int age;
		String gender;
		String department;
		int yearOfJoining;
		double salary;

		public Employee(int id, String name, int age, String gender, String department, int yearOfJoining,
				double salary) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.department = department;
			this.yearOfJoining = yearOfJoining;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getGender() {
			return gender;
		}

		public String getDepartment() {
			return department;
		}

		public int getYearOfJoining() {
			return yearOfJoining;
		}

		public double getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
					+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
		}

	}
}
