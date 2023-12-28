package code.binarysearch;

public class PeakIndexInMountainArr {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 3, 3, 1, 1 };
		System.out.println(peakIndexInMountainArray(arr));
		//System.out.println(peakIndexInMountainSecondWay(arr));
	}

	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if ((mid == 0 && arr[mid] > arr[mid + 1])
					|| (mid != 0 && mid != arr.length - 1 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
					|| (mid == arr.length - 1 && arr[mid] > arr[mid - 1])) {
				return mid;
			} else if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else // if (arr[mid] > arr[mid + 1])
			{
				end = mid - 1;
			}
		}
		return -1;
	}

	public static int peakIndexInMountainSecondWay(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else if (arr[mid] > arr[mid + 1]) {
				end = mid;
			}
		}
		return start;
	}
}
