package code.recursion;

public class FibonacciNumber {
	public static void main(String[] args) {
		System.out.println(findFibonacci(6));
	}
	static int findFibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int result1 = findFibonacci(n - 1);
		int result2 = findFibonacci(n - 2);
		return result1 + result2;
	}
}
