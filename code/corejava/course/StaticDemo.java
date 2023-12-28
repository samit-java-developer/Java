package code.corejava.course;

class Mobile {
	String brand;
	int price;
	static String name;

	static {
		name = "Phone";
		System.out.println("in static block");
	}

	Mobile() {
		brand = "";
		price = 200;
		System.out.println("in constructor");
	}

	// instance method
	public void show() {
		System.out.println(brand + ":" + price + ":" + name);
	}

	// static method
	public static void show1(Mobile obj) {
		System.out.println(obj.brand + ":" + obj.price + ":" + name);
	}
}

public class StaticDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Mobile obj1 = new Mobile();
		Mobile obj2 = new Mobile();
		obj1.show1(obj1);

	}

}
