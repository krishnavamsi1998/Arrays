package ArrayConcept;

//O(n-1)
public class ArrayCycleRotationByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 3, 8, 95, 6 };
		int n = arr.length;

		int t = arr[0];

		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];

		}

		arr[n - 1] = t;

		for (int i : arr)
			System.out.print(i + " ");

	}

}
