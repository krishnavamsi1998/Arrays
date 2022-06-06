package ArrayConcept;

//O(n3),O(1)
public class SubArraySumZeroBF {

	public static void main(String[] args) {

		int[] arr = { 4, 2, -3, 1, 6 };
		int n = arr.length;

		System.out.println(subArraySumZero(arr, n));

	}

	private static boolean subArraySumZero(int[] arr, int n) {

		int s = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				s = 0;
				for (int k = i; k <= j; k++) {
					s += arr[k];
				}
				if (s == 0)
					return true;
				System.out.println(s);

			}

		}
		return false;
	}

}
