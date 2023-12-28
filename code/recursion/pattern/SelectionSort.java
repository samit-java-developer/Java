package code.recursion.pattern;

public class SelectionSort {

	static void swap(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

	static void seclectionSortRecusion(int[] arr, int row, int col, int temp) {
		if (row == 0) {
			return;
		}
		if (row > col) {
			temp = Math.max(temp, arr[col]);
			seclectionSortRecusion(arr, row, col + 1, temp);
		} else {
			temp = Math.max(temp, arr[row]);
			arr[row] = temp;
			temp = arr[0];
			seclectionSortRecusion(arr, row - 1, 0, temp);
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

	static void selectionSort(int[] arr) {
		int n = arr.length;
		int i, j;
		for (i = 0; i < n ; i++) {
			int max_index = n - i - 1;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[max_index] < arr[j]) {
					max_index = j;
				}
			}
			int temp = arr[max_index];
			arr[max_index] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 16, 18, 1, 23, 4, 5, 78 };
		selectionSort(arr);
		printArray(arr);
	}

}
