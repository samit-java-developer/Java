package code.binarysearch;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
		int target = 7;
		int starting_index = firstIndexOfTarget(arr, target);
		System.out.println(starting_index);

		int ending_index = lastIndexOfTarget(arr, target);
		System.out.println(ending_index);
	}

	static int firstIndexOfTarget(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if ((arr[mid] == target && mid == 0) || (mid > 0 && arr[mid] == target && arr[mid - 1] < arr[mid])) {
				return mid;
			} else if (arr[mid] >= target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	static int lastIndexOfTarget(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if ((arr[mid] == target && mid == arr.length - 1)
					|| (mid < arr.length - 1 && arr[mid] == target && arr[mid + 1] > arr[mid])) {
				return mid;
			} else if (arr[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
}
