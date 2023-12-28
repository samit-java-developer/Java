package code.cyclicsort;

public class FindMissingPositive {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int missingPositiveNumber(int[] arr) {
		int ans = arr.length+1;
		for (int i = 0; i < arr.length; i++) {
			int correct = arr[i] - 1;
			while (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
				correct = arr[i] - 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - 1 != i)
				return i + 1;
		}
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = {0,1,2 };
		System.out.println(missingPositiveNumber(arr));

	}

}
