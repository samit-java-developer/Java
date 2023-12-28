package code.recursion;

public class BinarySearch {

	static int binarySearch(int[] arr, int start, int end, int target) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (arr[mid] == target) {
			return mid;
		}
		if (target > arr[mid]) {
			return binarySearch(arr, mid + 1, end, target);
		} else {
			return binarySearch(arr, start, mid - 1, target);
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int target = 7;
		System.out.println(binarySearch(arr, 0, arr.length - 1, target));
	}

}
