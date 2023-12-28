package code.linearsearch;


public class EvenDigit {

	static int count(int n) {
		if (n==0) {
			return 1;
		}
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	static int count2(int n) {
		if (n==0) {
			return 1;
		}
		if (n<0) {
			n=n*-1;
		}
		return (int)Math.log10(n)+1;
	}

	static int noOfDigit(int[] nums) {
		int noOfEven = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count2(nums[i]) % 2 == 0) {
				noOfEven =noOfEven+1;
			}
		}
		return noOfEven;
	}

	public static void main(String[] args) {
		int[] arr= {-300303};
		System.out.println("No of even digits in array is "+noOfDigit(arr));
		System.out.println("No of digits in "+count2(10000));
	}

}
