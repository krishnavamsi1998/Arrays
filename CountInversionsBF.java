package ArrayConcept;

//count a[i]>a[j] , i<j 
//O(n2),O(1)

public class CountInversionsBF {

	public static void main(String[] args) {

		int[] arr = { 1, 20, 6, 4, 5 };
		int n = arr.length;
		int c = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j])
					c++;

			}
		}

		System.out.println(c);

	}

}
