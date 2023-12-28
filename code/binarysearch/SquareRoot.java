package code.binarysearch;

public class SquareRoot {

	static int findSquareRoot(int x) {
		if (x == 0 || x == 1) {
			return x;
		} else {
			int start = 1;
			int end = x;
			while (start < end) {
				int mid = start + (end - start) / 2;
				if ((long) mid * mid == (long) x
						|| (long) mid * mid < (long) x && (long) (mid + 1) * (mid + 1) > (long) x) {
					return mid;
				} else {
					if ((long) mid * mid > x) {
						end = mid;
					} else {
						start = mid;
					}
				}
			}
		}
		return -1;
	}

	static int findSquareRootCorrect(int x) {
		int mid = -1;
		int start = 1;
		int end = x;
		if (x == 0 || x == 1) {
			return x;
		} else {
			while (start <= end) {
				mid = start + (end - start) / 2;
				if (mid * mid == x) {
					return mid;
				} else if (mid * mid > x) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		System.out.println("start " + start);
		System.out.println("end " + end);
		return end;
	}

	public static void main(String[] args) {
		System.out.println(findSquareRootCorrect(8));
	}

}
