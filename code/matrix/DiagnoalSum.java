package code.matrix;

public class DiagnoalSum {
	
	private static int diagonalSum(int[][] mat) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int len = mat.length;
		while (i <= len - 1 && j <= len - 1) {
			sum += mat[i][j];
			i++;
			j++;
		}
		i = 0;
		j = len - 1;
		while (i <= len - 1 && j >= 0) {
			if (len % 2 == 1 && i == j) {
				sum += 0;
			} else {
				sum += mat[i][j];
			}
			i++;
			j--;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
