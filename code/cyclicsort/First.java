package code.cyclicsort;

public class First {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 1, 4, 6 };
		cyclicSort(arr);
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	public static void swap(int[] arr, int first, int last) {
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}

	public static void cyclicSort(int[] arr) {
		int i = 0;
		while (true) {
			if (arr[i] != i + 1) {
				swap(arr, i, arr[i] - 1);
				continue;
			}
			i++;
			if (i == arr.length) {
				break;
			}
		}
	}

}
