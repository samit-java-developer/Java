package code.corejava.course;

class A {
	public A() {
		System.out.println("in A");
	}

	public A(int x) {
		System.out.println("in A paramtrized");
	}
}

class B extends A {
	public B() {
		System.out.println("in B");
	}

	public B(int x) {
		this();
		System.out.println("in B paramtrized");
	}
}

public class ThisAndSuper {

	public static void main(String[] args) {	
		// B obj = new B();
		B obj2 = new B(2);
	}

}
