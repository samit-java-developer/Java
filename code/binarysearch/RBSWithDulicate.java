package code.binarysearch;

public class RBSWithDulicate {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 2, 3, 2, 2, 2 };
		System.out.println(findPivot(arr));
		int target = 3;
		System.out.println(search(arr, target));
	}

	static boolean search(int[] arr, int target) {
		int pivot = findPivot(arr);
		int result = -1;
		if (pivot == -1) {
			result = binarySearchASC(arr, target, 0, arr.length - 1);
		} else {
			if (arr[pivot] == target) {
				result = pivot;
			} else {
				if (target >= arr[0]) {
					result = binarySearchASC(arr, target, 0, pivot - 1);
				} else {
					result = binarySearchASC(arr, target, pivot + 1, arr.length - 1);
				}
			}
		}
		if (result == -1) {
			return false;
		} else {
			return true;
		}
	}

	static int binarySearchASC(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			}
		}
		return -1;
	}

	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
