package ArrayConcept;

//count a[i]>a[j] , i<j 
//O(nlogn),O(1)
//if a[i] in left array > a[j] in right array then
//a[i], a[i+1],a[i+2]..a[i+m] are inversions
//that means (m+1) -i inversions
//(m+1)-(index1 + l)

public class CountInversionMergeSort {

	public static void main(String[] args) {

		int arr[] = { 3, 1, 2 };
		int n = arr.length;
		int iv = mergeSort(arr, 0, n - 1);
		System.out.println(iv);
	}

	private static int mergeSort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int inversionCount = 0;
		if (i >= j)
			return 0;
		int mid = i + (j - i) / 2;
		inversionCount += mergeSort(arr, 0, mid);
		inversionCount += mergeSort(arr, mid + 1, j);
		inversionCount += merge(arr, i, mid, j);
		return inversionCount;

	}

	private static int merge(int[] arr, int i, int mid, int j) {
		// TODO Auto-generated method stub
		int inversionCount = 0;
		int l1 = (mid - i) + 1;
		int l2 = (j - mid);
		int left[] = new int[l1];
		int right[] = new int[l2];

		int mainArrayIndex = i;
		for (int x = 0; x < l1; x++)
			left[x] = arr[mainArrayIndex++];

		mainArrayIndex = mid + 1;
		for (int y = 0; y < l2; y++)
			right[y] = arr[mainArrayIndex++];

		int index1 = 0;
		int index2 = 0;

		mainArrayIndex = i;

		while (index1 < l1 && index2 < l2) {
			if (left[index1] < right[index2])
				arr[mainArrayIndex++] = left[index1++];
			else {
				arr[mainArrayIndex++] = right[index2++];
				inversionCount += (mid + 1) - (i + index1);
			}

		}
		while (index1 < l1)
			arr[mainArrayIndex++] = left[index1++];

		while (index2 < l2)
			arr[mainArrayIndex++] = right[index2++];

		return inversionCount;
	}

}
