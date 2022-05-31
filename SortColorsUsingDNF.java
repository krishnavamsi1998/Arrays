//TimeComplexity,SpaceComplexity
//O(n),O(1)
//traversing only once
//low represents end index of 0
//high represents starting index of 2

public class SortColorsUsingDNF {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 1, 1, 2, 0, 1, 1, 0, 2 };
		int n = arr.length;

		int low, mid, high;
		low = mid = 0;
		high = n - 1;

		while (mid <= high) {

			switch (arr[mid]) {
			case 0:
				swap(arr, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr, mid, high);
				high--;
				break;

			}
		}

		for (int i : arr)
			System.out.print(i + " ");

	}

	private static void swap(int[] arr, int start, int end) {
	

		int t = arr[start];
		arr[start] = arr[end];
		arr[end] = t;

	}

}
