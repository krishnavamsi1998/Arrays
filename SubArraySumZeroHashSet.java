package ArrayConcept;

import java.util.HashSet;

//O(n),O(n)
//if prefix sum is repeated or 0 then there is sub array with sum 0
//use unordered hashset for efficiency i.e normal hashset
public class SubArraySumZeroHashSet {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 0, 1, 6 };
		int n = arr.length;

		System.out.println(hasSubArray(arr, n));

	}

	private static boolean hasSubArray(int[] arr, int n) {

		HashSet<Integer> hs = new HashSet<>();
		int sum = 0;

		for (int i = 0; i < n; i++) {

			sum += arr[i];
			// add method returns false if duplicate is added

			if (arr[i] == 0 || sum == 0 || !hs.add(sum))
				return true;

		}
		return false;
	}

}
