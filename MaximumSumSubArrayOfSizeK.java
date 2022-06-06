package slidingWindow;

//O(n)
//O(1)
public class MaximumSumSubArrayOfSizeK {

	public static void main(String[] args) {

		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20 };
		int k = 4;
		System.out.println(calculateMaxSum(arr, k));

	}
	

	private static int calculateMaxSum(int[] arr, int k) {

		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		//System.out.println(Integer.MIN_VALUE);
		int start = 0;

		if (k <= 0 || k > arr.length || arr.length == 0)
			return -1;

		// calculate sum of first window
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		// remove first element from sum and add next element
		// check with maxSum

		for (int i = k; i < arr.length; i++) {

			sum = sum + arr[i] - arr[start++];

			maxSum = sum > maxSum ? sum : maxSum;

		}

		return maxSum;
	}

}
