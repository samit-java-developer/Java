package code.binarysearch;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = { 3, 2 };
		int target = 1;
		
	}

	static int binarySearchASC(int[] arr, int target, int start, int end, boolean isAesc) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAesc) {
				if (arr[mid] < target) {
					start = mid + 1;
				} else if (arr[mid] > target) {
					end = mid - 1;
				}
			} else {
				if (arr[mid] < target) {
					end = mid - 1;
				} else if (arr[mid] > target) {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

	static int findPivotElement(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[0]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}

}
