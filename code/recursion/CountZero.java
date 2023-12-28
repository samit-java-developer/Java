package code.recursion;

public class CountZero {
	
	static int countZero(int n, int count) {
		if (n == 0) {
			return count;
		}
		if (n % 10 == 0) {
			count += 1;
			return countZero(n / 10, count);
		} else {
			count += 0;
			return countZero(n / 10, count);
		}
	}
	public static void main(String[] args) {
		System.out.println("Befor executing count value: " + countZero(100000, 0));
	}

}
