package code.recursion.array;

public class RotatedBinarySearch {

	static int rotatedBinarySearch(int[] arr, int start, int end, int target) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (arr[mid] == target) {
			return mid;
		}
		if (arr[mid] >= arr[start]) {
			if (target >= arr[start] && target <= arr[mid]) {
				return rotatedBinarySearch(arr, start, mid - 1, target);
			} else {
				return rotatedBinarySearch(arr, mid + 1, end, target);
			}
		}
		if (target >= arr[mid] && target <= arr[end]) {
			return rotatedBinarySearch(arr, mid + 1, end, target);
		} else {
			return rotatedBinarySearch(arr, start, mid - 1, target);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 9};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Original Index of " + arr[i] + " is " + i);
			System.out.println("Index of " + arr[i] + " is " + rotatedBinarySearchP(arr, 0, arr.length - 1, arr[i]));
		}
	}

	static int rotatedBinarySearchP(int[] arr, int start, int end, int target) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (arr[mid] == target) {
			return mid;
		}
		if (arr[mid] >= arr[start]) {
			if (target >= arr[start] && target <= arr[mid]) {
				return rotatedBinarySearchP(arr, start, mid - 1, target);
			} else {
				return rotatedBinarySearchP(arr, mid + 1, end, target);
			}
		}
		if (target >= arr[mid] && target <= arr[end]) {
			return rotatedBinarySearchP(arr, mid + 1, end, target);
		} else {
			return rotatedBinarySearchP(arr, start, mid - 1, target);
		}
	}

}
