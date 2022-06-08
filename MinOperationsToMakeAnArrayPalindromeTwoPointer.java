package ArrayConcept;

//O(n),O(1)

public class MinOperationsToMakeAnArrayPalindromeTwoPointer {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 3, 1 };
		int n = arr.length;

		int i = 0;
		int j = n - 1;

		int c = 0;

		while (i < j) {
			if (arr[i] < arr[j]) {
				arr[i + 1] += arr[i];
				i++;
				c++;

			} else if (arr[i] > arr[j]) {
				arr[j - 1] += arr[j];
				j--;
				c++;

			} else {
				i++;
				j--;
			}

		}
		System.out.println(c);

	}

}
