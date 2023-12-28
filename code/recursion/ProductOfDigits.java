package code.recursion;

public class ProductOfDigits {

	public static void main(String[] args) {
		System.out.println("First Way "+productOfTheDigits(1234));
		System.out.println("Second Way "+productOfTheDigits2(1234, 1));
	}

	private static int productOfTheDigits(int n) {
		if (n == 0) {
			return 1;
		}
		return n % 10 * productOfTheDigits(n / 10);
	}

	private static int productOfTheDigits2(int n, int product) {
		if (n == 0) {
			return product;
		}
		return productOfTheDigits2(n / 10, (product) * (n % 10));
	}
}
