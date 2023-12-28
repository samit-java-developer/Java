package code.binarysearch;

public class Floor {

	public static void main(String[] args) {
		int[] arr = { -40, -30, -20, -10, 10, 20, 30, 40, 60, 70, 80, 90, 100 };
		System.out.println("Floor of an Array is.......");
		int target = 45;
		System.out.println(floor(arr, target));
	}

	// return the greatest element less than equal to target.
	static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return arr[mid];
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			}
		}
		return arr[end];
	}

}
