package code.corejava.course;

class Calculator {
	
	// statically typed language;
	private int num = 5;

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public double add(double num1, int num2) {
		return num1 + num2;
	}
}

class AdvCalculator extends Calculator {

}

class Computer {

	public void playMusic() {
		System.out.println("Music Palying..");
	}

	public String getMeAPen(int cost) {
		if (cost >= 10)
			return "Pen";

		return "Nothing";
	}
}

public class Demo {

	public static void main(String[] args) {

		AdvCalculator obj = new AdvCalculator();
		AdvCalculator obj1 = new AdvCalculator();

		int r1 = obj.add(2, 7);
		System.out.println(r1);

	}
}
