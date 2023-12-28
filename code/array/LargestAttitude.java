package code.array;

public class LargestAttitude {

	static int largestAttitude(int[] arr) {
		int[] newArr = new int[arr.length + 1];
		newArr[0] = 0;
		int max = 0;
		for (int i = 1; i < arr.length + 1; i++) {
			newArr[i] = newArr[i - 1] + arr[i - 1];
			max = Math.max(max, newArr[i]);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { -5, 1, 5, 0, -7 };
		int result = largestAttitude(arr);
		System.out.println(result);
	}

}
