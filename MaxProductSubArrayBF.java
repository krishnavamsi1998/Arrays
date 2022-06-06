package ArrayConcept;

//O(n2),O(1)

public class MaxProductSubArrayBF {

	public static void main(String[] args) {

		int[] arr = { 1, -2, 3 };
		int n = arr.length;

		System.out.println(maxProduct(arr, n));

	}

	private static int maxProduct(int[] arr, int n) {

		if (n == 1)
			return arr[0];

		int gmax = 0;
		int lmax = 1;

		for (int i = 0; i < n; i++) {

			lmax = 1;
			for (int j = i; j < n; j++) {
				lmax *= arr[j];
				gmax = gmax < lmax ? lmax : gmax;
			}

		}

		return gmax;
	}

}
