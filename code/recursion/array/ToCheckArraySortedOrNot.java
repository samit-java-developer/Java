package code.recursion.array;

public class ToCheckArraySortedOrNot {
	static boolean checkSorted(int[] arr, int index, int size) {
		if (index == size - 1) {
			return true;
		}
		if (index + 1 < size && (arr[index] > arr[index + 1])) {
			return false;
		}
		return checkSorted(arr, index + 1, size);
	}

	static boolean checkSorted2(int[] arr, int index, int size) {
		if (index == size - 1) {
			return true;
		}
		if ((index + 1) >= size) {
			return false;
		}
		return arr[index] <= arr[index + 1] && checkSorted2(arr, index + 1, size);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 5 };
		System.out.println(checkSorted2(arr, 0, arr.length));
	}

}
