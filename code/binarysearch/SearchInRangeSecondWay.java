package code.binarysearch;

public class SearchInRangeSecondWay {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
		int target = 7;
		int start_index=getIndexOfTarget(arr, target, true);
		int last_index=getIndexOfTarget(arr, target, false);
		System.out.println(start_index);
		System.out.println(last_index);
	}

	static int getIndexOfTarget(int[] arr, int target, boolean isFirstOccurence) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				ans = mid;
				if (isFirstOccurence) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			}
		}
		return ans;
	}

}
