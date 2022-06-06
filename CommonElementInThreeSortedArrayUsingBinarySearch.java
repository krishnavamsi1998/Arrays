package ArrayConcept;
//O(n1*log(n2*n3))
//O(1)

public class CommonElementInThreeSortedArrayUsingBinarySearch {

	public static void main(String[] args) {

		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		int n1 = ar1.length;
		int n2 = ar2.length;
		int n3 = ar3.length;
		System.out.println("Common elements are ");
		// function calling
		findCommon(ar1, ar2, ar3, n1, n2, n3);

	}

	public static void findCommon(int a[], int b[], int c[], int n1, int n2, int n3) {
		// Iterate on first array
		for (int j = 0; j < n1; j++) {
			
			//to avoid duplicates in sorted array the duplicates will be adjacent
			if (j != 0 && a[j] == a[j - 1]) {
				continue;
			}
			 
			// check if the element is present in 2nd and 3rd
			// array.
			if (binary_search(b, n2, a[j]) && binary_search(c, n3, a[j])) {

				System.out.print(a[j] + " ");

			}
		}
	}

	public static boolean binary_search(int arr[], int n, int element) {
		int l = 0, h = n - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == element) {
				return true;
			} else if (arr[mid] > element) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}
}
