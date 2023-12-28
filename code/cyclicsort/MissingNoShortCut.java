package code.cyclicsort;

public class MissingNoShortCut {

	static int totalSum(int n) {
		return (n * (n + 1)) / 2;
	}

	public int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int totalSum = totalSum(nums.length);
		return totalSum - sum;
	}

	public static void main(String[] args) {
	}

}
