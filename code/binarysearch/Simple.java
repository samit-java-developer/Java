package code.binarysearch;

public class Simple {

	public static void main(String[] args) {
		int[] arr = { -40, -30, -20, -10, 10, 20, 30, 40, 60, 70, 80, 90, 100 };
		int[] arr2 = { 100, 90, 80, 70, 60, 40, 30, 20, 10, -10, -20, -30, -40 };
		int target = 10;
		System.out.println(binarySearchASC(arr, target));
		System.out.println(binarySearchDESC(arr2, target));
		System.out.println("===================Order Agnostic ==================");
		System.out.println(arr[0] < arr[arr.length - 1] ? orderAgnosticBinarySearch(arr, target, true)
				: orderAgnosticBinarySearch(arr, target, false));
		System.out.println(arr2[0] < arr2[arr2.length - 1] ? orderAgnosticBinarySearch(arr2, target, true)
				: orderAgnosticBinarySearch(arr2, target, false));

	}

	static int orderAgnosticBinarySearch(int[] arr, int target, boolean isAesc) {
		int start = 0;
		int end = arr.length - 1;
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

	// return the index of the array
	static int binarySearchASC(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
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

	static int binarySearchDESC(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				end = mid - 1;
			} else if (arr[mid] > target) {
				start = mid + 1;
			}
		}
		return -1;
	}

}
