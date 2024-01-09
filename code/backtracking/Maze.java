package code.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {

	public static void main(String[] args) {
		boolean[][] arr = new boolean[3][3];
		int[][] result = new int[3][3];
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				arr[i][j] = true;
			}
		}
		// arr[1][1] = false;
		pathReturns("", 0, 0, arr, 0, result);
	}

	static int count(int row, int col) {
		if (row == 0 || col == 0) {
			return 1;
		}
		int right = count(row, col - 1);
		int below = count(row - 1, col);
		return right + below;
	}

	static int count(String p, int row, int col) {
		if (row == 1 && col == 1) {
			System.out.println(p);
			return 1;
		}
		int right = 0;
		int below = 0;
		if (row != 1 && col != 1) {
			right = count(p + "R", row, col - 1);
			below = count(p + "D", row - 1, col);
			return right + below;
		} else {
			if (row == 1) {
				right = count(p + "R", row, col - 1);
			}
			if (col == 1) {
				below = count(p + "D", row - 1, col);
			}
		}
		return right + below;
	}

	static List<String> pathReturn(String p, int row, int col) {
		List<String> totalPath = new ArrayList<String>();
		if (row == 1 && col == 1) {
			totalPath.add(p);
			return totalPath;
		}
		if (row > 1 && col > 1) {
			totalPath.addAll(pathReturn(p + "S", row - 1, col - 1));
		}
		if (row > 1) {
			totalPath.addAll(pathReturn(p + "D", row - 1, col));
		}
		if (col > 1) {
			totalPath.addAll(pathReturn(p + "R", row, col - 1));
		}
		return totalPath;
	}

	static int pathRestrictions(int row, int col, boolean[][] arr) {
		if (row == arr.length - 1 && col == arr[0].length - 1) {
			return 1;
		}
		int left = 0;
		int down = 0;
		if (row < arr.length - 1 && arr[row + 1][col]) {
			down = pathRestrictions(row + 1, col, arr);
		}
		if (col < arr[0].length - 1 && arr[row][col + 1]) {
			left = pathRestrictions(row, col + 1, arr);
		}
		return left + down;
	}

	static void pathReturns(String p, int row, int col, boolean[][] arr) {
		if (row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(p);
			return;
		}
		if (!arr[row][col]) {
			return;
		}
		arr[row][col] = false;
		if (row < arr.length - 1) {
			pathReturns(p + "B1", row + 1, col, arr);
		}
		if (col < arr[0].length - 1) {
			pathReturns(p + "R2", row, col + 1, arr);
		}
		if (row > 0) {
			pathReturns(p + "V3", row - 1, col, arr);
		}
		if (col > 0) {
			pathReturns(p + "L4", row, col - 1, arr);
		}
		arr[row][col] = true;
	}

	static void pathPrint(String p, int row, int col, boolean[][] arr, int count, int[][] result) {
		if (row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(p);
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[0].length; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}
		if (!arr[row][col]) {
			return;
		}
		arr[row][col] = false;
		count = count + 1;
		result[row][col] = count;
		if (row < arr.length - 1) {
			pathPrint(p + "B", row + 1, col, arr, count, result);
		}
		if (col < arr[0].length - 1) {
			pathPrint(p + "R", row, col + 1, arr, count, result);
		}
		if (row > 0) {
			pathPrint(p + "V", row - 1, col, arr, count, result);
		}
		if (col > 0) {
			pathPrint(p + "L", row, col - 1, arr, count, result);
		}
		arr[row][col] = true;
		count = count - 1;
		result[row][col] = count;
	}

}
