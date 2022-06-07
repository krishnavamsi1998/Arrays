package ArrayConcept;

// same size means length will be always even, even if we merge
//so return avrg of mid and mid-1
//count while merging
//O(n),O(1)
//Use the merge procedure of merge sort. Keep track of count,
//while comparing elements of two arrays. 
//If count becomes n(For 2n elements), we have reached the median. 
//keep track of last two elements after comparing

public class MedianOfTwoSortedArraysSameSize {

	static int getMedian(int ar1[], int ar2[], int n) {
		int i = 0;
		int j = 0;
		int count;
		int m1 = -1, m2 = -1;

		for (count = 0; count <= n; count++) {

			if (ar1[i] <= ar2[j]) {

				m1 = m2;
				m2 = ar1[i];
				i++;
				
			} else {

				m1 = m2;
				m2 = ar2[j];
				j++;
			}
		}

		return (m1 + m2) / 2;
	}

	public static void main(String[] args) {

		int ar1[] = { 1, 2, 3, 6 };
		int ar2[] = { 4, 6, 8, 10 };

		int n1 = ar1.length;
		int n2 = ar2.length;
		if (n1 == n2)
			System.out.println("Median is " + getMedian(ar1, ar2, n1));
		else
			System.out.println("arrays are of unequal size");

	}

}
