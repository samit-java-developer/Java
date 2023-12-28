package code.corejava.course;

class Human {

	private int age = 11;
	private String name = "Navin";

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Human obj = new Human();
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
