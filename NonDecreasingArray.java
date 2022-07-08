package arrays;

//your task is to check if it could become non-decreasing by modifying at most one element.
//leetcode

public class NonDecreasingArray {

	private static boolean isNonDecreasing(int[] nums) {

		int n = nums.length;

		boolean changed = false;

		for (int i = 0; i < n - 1; i++) {
			// already non decreasing
			if (nums[i] <= nums[i + 1])
				continue;
			// which means already one modification is done so we return false
			if (changed)
				return false;
			// i==0 edge case
			// logic:
			if (i == 0 || nums[i - 1] <= nums[i + 1])
				nums[i] = nums[i + 1];
			else
				nums[i + 1] = nums[i];
			changed = true;

		}

		return true;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 4, 2 };

		System.out.println(isNonDecreasing(nums));

	}

}
