package code.recursion.pattern;

public class BubbleSort {

	static void swap(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

	static void bubbleSortRecusion(int[] arr, int row, int col) {
		if (row == 0) {
			return;
		}
		if (row > col) {
			if (arr[col] > arr[col + 1]) {
				swap(arr, col, col + 1);
			}
			bubbleSortRecusion(arr, row, col + 1);
		} else {
			bubbleSortRecusion(arr, row - 1, 0);
		}

	}

	static void bubbleSort(int[] arr) {
		int i, j;
		int n = arr.length;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 16, 18, 1, 23, 4, 5, 78 };
		bubbleSortRecusion(arr, arr.length - 1, 0);
		printArray(arr);
	}

}
