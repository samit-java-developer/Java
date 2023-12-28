package code.binarysearch;

public class Ceiling {

	public static void main(String[] args) {
		int[] arr = { -40, -30, -20, -10, 10, 20, 30, 40, 60, 70, 80, 90, 100 };
		System.out.println("Ceiling of an Array is.......");
		int target = 100;
		System.out.println(ceiling(arr, target));
		System.out.println("=====================================");
		char[] charArr = { 'c', 'f', 'j' ,'i','j'};
		char targetChar = 'k';
		System.out.println(ceilingInCharArray(charArr, targetChar));
	}

	// return the smallest index greater than equal to target.
	static int ceiling(int[] arr, int target) {
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
		return arr[start];
	}

	static char ceilingInCharArray(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (letters[mid] <= target) {
				start = mid + 1;
			} else if (letters[mid] > target) {
				end = mid - 1;
			}
		}
		return start == letters.length ? letters[0] : letters[start];
	}
}
