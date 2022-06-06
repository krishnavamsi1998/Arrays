package ArrayConcept;

//O(n1+n2+n3),O(1)

public class CommonElementInThreeSortedArrays {

	public static void main(String[] args) {

		int[] ar1 = { 1, 2, 3 };

		int[] ar2 = { 1, 3, 4, 5 };
		int[] ar3 = { 1, 2, 3, 4, 6 };

		int x, y, z;
		x = ar1.length;
		y = ar2.length;
		z = ar3.length;

		int i, j, k;
		i = j = k = 0;

		while (i < x && j < y && k < z) {

			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.print(ar1[i] + " ");
				i++;
				j++;
				k++;
			} else if (ar1[i] < ar2[j])
				i++;
			else if (ar2[j] < ar3[k])
				j++;
			// We reach here when x > y and z < y, i.e., z ex: 3,2,1
			// is smallest
			else
				k++;

		}

	}

}
