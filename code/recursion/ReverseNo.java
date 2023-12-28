package code.recursion;

public class ReverseNo {

	static int ans = 0;

	public static void main(String[] args) {
		int reverse = reverseDigit(123);
		System.out.println(reverse);
		System.out.println("121 is pailndrome or not: " + isPailndrome(121, 0, 121));
	}

	static int reverseDigit(int n) {
		if (n == 0) {
			return ans;
		}
		int temp = n % 10;
		reverseDigit(n / 10);
		ans = ans * 10 + temp;
		return ans;
	}

	static int reverseDigit2(int n, int reverse) {
		if (n == 0) {
			return reverse;
		}
		int temp = n % 10;
		return reverseDigit2(n / 10, reverse * 10 + temp);
	}

	static boolean isPailndrome(int n, int reverse, int actual) {
		if (n == 0) {
			return reverse == actual;
		}
		int temp = n % 10;
		return isPailndrome(n / 10, reverse * 10 + temp, actual);
	}

}
