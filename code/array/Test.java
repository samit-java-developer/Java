package code.array;

public class Test {
	public static int oddCells(int m, int n, int[][] indices) {
		int[][] result = new int[m][n];
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = 0;
			}
		}
		for (int i = 0; i < indices.length; i++) {
			int rowsIndex = indices[i][0];
			int columnIndex = indices[i][1];
			for (int k = 0; k < n; k++) {
				result[rowsIndex][k] += 1;
			}
			for (int k = 0; k < m; k++) {
				result[k][columnIndex] += 1;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (result[i][j] % 2 == 1) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] indices = { { 0, 1 }, { 1, 1 } };
		System.out.println(oddCells(2, 3, indices));
	}

}
