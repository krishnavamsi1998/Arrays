package ArrayConcept;

import java.util.Arrays;

//O(m+n),O(m+n)
//we use merge concept for merging sorted arrays

//if merged array length is odd , return mid value
//if its is even return avrg of mid and mid-1 value

public class MedianOfTwoSortedArraysUsingMerge {

	private static int[] merge(int[] arr1, int n1, int[] arr2, int n2, int[] arr3, int n3) {

		int i, j, k;
		i = j = k = 0;

		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		while (i < n1)
			arr3[k++] = arr1[i++];

		while (j < n2)
			arr3[k++] = arr2[j++];

		return arr3;
	}

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 5, 8 };
		int[] arr2 = { 10, 12, 14, 16, 18, 20 };

		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = n1 + n2;

		int[] mergedArray = new int[n3];

		mergedArray = merge(arr1, n1, arr2, n2, mergedArray, n3);
		int mid = n3 / 2;

		if (n3 % 2 == 0)

			System.out.println((mergedArray[mid] + mergedArray[mid - 1]) / 2);

		else

			System.out.println(mergedArray[mid]);

	}

}
