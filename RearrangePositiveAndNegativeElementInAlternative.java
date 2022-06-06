package ArrayConcept;

import java.util.Arrays;
//O(n),O(1)
//if order does not matter
//bring all negative ele to right and swap negative with even pos of postive

public class RearrangePositiveAndNegativeElementInAlternative {

	public static void main(String[] args) {

		int[] arr = { -5, 3, 4, 5, -6, -2, 8, 9, -1, -4 };
		int n = arr.length;

		int i = 0;
		int j = n - 1;

		// move negative elements to right most side

		while (i <= j) {
			if (arr[i] < 0 && arr[j] > 0) {
				swap(arr, i, j);
				i++;
				j--;
			} else if (arr[i] > 0 && arr[j] < 0) {
				i++;
				j--;

			} else if (arr[i] > 0 && arr[j] > 0)
				i++;
			else
				j--;
		}

	
		// now i points to 1st negative element index

		int k = 0;
		// swap negative ele in even index of positive element
		while (i < n && k < n) {
			swap(arr, k, i);
			i++;
			k += 2;

		}

		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;

	}

}
