package code.corejava.course.functionalinterface;

@FunctionalInterface
interface A {
	// void show(int i);
	int add(int i, int j);
}

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		// First Way
//		A obj = new B();
//		obj.show();

		// Second Way
//		A obj = i -> System.out.println("in show " + i);
//
//		obj.show(2);

		A obj = (i, j) -> i + j;
		System.out.println(obj.add(2, 3));

	}
}
