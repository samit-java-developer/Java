package code.array;

import java.util.LinkedList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrcer {

	public static int[] createTargetArray(int[] nums, int[] index) {
		int size = nums.length;
		int[] traget = new int[size];
		List<Integer> result = new LinkedList<Integer>();
		for (int i = 0; i < size; i++) {
			result.add(index[i], nums[i]);
		}
		Object[] objArr = result.toArray();
		for (int i = 0; i < size; i++) {
			traget[i] = (Integer) objArr[i];
		}
		return traget;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };

		int[] result = createTargetArray(nums, index);
	}

}
