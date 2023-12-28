package code.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		int result = sumOfTheDigits(1234);
		System.out.println(result);
	}

	private static int sumOfTheDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return n % 10 + sumOfTheDigits(n / 10);
	}
}
