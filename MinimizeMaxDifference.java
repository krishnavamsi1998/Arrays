package ArrayConcept;

import java.util.Arrays;


//O(nlogn),O(1)
//for minmizing we check the adjust elements
//for and for max we check with previous max/min

public class MinimizeMaxDifference {

	public static void main(String[] args) {

		int[] arr = { 3, 9, 12, 16, 20 };
		int k = 3;
		int n = arr.length;

		int d = getMinimizedDifference(arr, n, k);
		System.out.println(d);

	}

	private static int getMinimizedDifference(int[] arr, int n, int k) {

		Arrays.sort(arr);

		int res = arr[n - 1] - arr[0];
		int mx, mn;
		int prmax, prmin;
		prmax = arr[n - 1] - k;
		prmin = arr[0] + k;

		for (int i = 1; i < n; i++) {

			if (arr[i] >= k) {

				mn = Math.min(arr[i] - k, prmin);
				mx = Math.max(arr[i - 1] + k, prmax);
				res = Math.min(res, mx - mn);
			}

		}
		return res;

	}

}
