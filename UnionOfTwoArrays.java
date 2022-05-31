package ArrayConcept;

import java.util.Iterator;
import java.util.LinkedHashSet;

//O(m+n),O(m+n)

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 5, 6 };
		int[] arr2 = { 2, 3, 5, 7 };

		// maintains insertion order
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		for (int i : arr1)
			lhs.add(i);
		for (int i : arr2)
			lhs.add(i);

		int[] res = new int[lhs.size()];

		Iterator<Integer> itr = lhs.iterator();

		int i = 0;
		// copying to resultant array
		while (itr.hasNext() && i < res.length)
			res[i++] = itr.next();

		for (int j : res) {
			System.out.print(j + " ");
		}

	}

}
