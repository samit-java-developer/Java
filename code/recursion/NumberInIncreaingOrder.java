package code.recursion;

public class NumberInIncreaingOrder {

	public static void main(String[] args) {
		// write a function that takes a number then print it.
		print(5);
	}

	static void print(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}
		print(n - 1);
		System.out.println(n);
	}

}
