package code.cyclicsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MissingNumber {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int missingNumber(int[] arr) {
		int ans = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr.length) {
				while (arr[i] != i && arr[i] != arr.length) {
					swap(arr, i, arr[i]);
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == arr[i]) {
				continue;
			} else {
				ans = i;
				break;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1 };
		int res = missingNumber(arr);
		System.out.println(res);
	}

}
