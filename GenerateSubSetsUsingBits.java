package ArrayConcept;

import java.util.ArrayList;
//O(n*(2^n)),O(n*(2^n))

// refer diagram in https://java2blog.com/find-subsets-set-power-set/

public class GenerateSubSetsUsingBits {

	private static ArrayList<ArrayList<Integer>> generate(int[] arr, int n) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		ArrayList<Integer> innerList;
		// there will be 2^n elements generated which equivalent to 1<<n

		for (int i = 0; i < (1 << n); i++) {

			innerList = new ArrayList<>();
			// check every bit of i
			// to check which bit is set to 1
			for (int j = 0; j < n; j++) {
				// if j'th bit of `i` is set to 1, append `S[j]` to the subset
				// 1 & 1=1
				if ((i & (1 << j)) > 0)
					innerList.add(arr[j]);
			}

			list.add(innerList);

		}

		return list;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int n = arr.length;

		System.out.println(generate(arr, n));

	}

}
