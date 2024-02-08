package code.recursion.practice;

import java.io.*;
import java.util.Arrays;

class SumTriangleArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			long n = Long.parseLong(br.readLine().trim());
			long a[] = new long[(int) (n)];
			// long getAnswer[] = new long[(int)(n)];
			String inputLine[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				a[i] = Long.parseLong(inputLine[i]);
			}

			Compute obj = new Compute();
			// obj.getTriangle(a, n);

			long Triangle[] = obj.getTriangle(a, n);
			int sz = Triangle.length;

			StringBuilder output = new StringBuilder();
			for (int i = 0; i < sz; i++)
				output.append(Triangle[i] + " ");
			System.out.println(output);

		}
	}
}

class Compute {

	public long[] getTriangle(long arr[], long n) {
		if (n == 1) {
			// System.out.println();
			return arr;
		}
		long[] result = new long[(int) (n - 1)];
		for (int i = 0; i < n - 1; i++) {
			result[i] = arr[i] + arr[i + 1];
		}
		System.out.println(Arrays.toString(result));
		long[] previous = getTriangle(result, n - 1);
		long[] total = new long[arr.length + previous.length];
		int t = 0;
		for (int k = 0; k < previous.length; k++) {
			total[t] = previous[k];
			t++;
		}
		for (int k = 0; k < arr.length; k++) {
			total[t] = arr[k];
			t++;
		}
		return total;
	}
}