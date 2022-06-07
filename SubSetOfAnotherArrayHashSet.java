package ArrayConcept;

import java.util.HashSet;

//assume every element in arr1 is distinct 

//O(n),O(n)

public class SubSetOfAnotherArrayHashSet {

	private static boolean isSubSet(int[] arr1, int[] arr2, int n1, int n2) {

		HashSet<Integer> set = new HashSet<>();

		// add every element of arr1 in set

		for (int i : arr1)
			set.add(i);

		// if any ele in arr2 appears for first time in set that means it is not subset
		// if it appears for 2nd time or more then it is subset
		// set returns false if duplicate added

		for (int j : arr2) {
			if (!set.add(j))
				continue;
			else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		int[] arr1 = { 11, 1, 13, 21, 3, 7 };
		int[] arr2 = { 11, 3, 7, 1 };

		int n1 = arr1.length;
		int n2 = arr2.length;

		System.out.println(isSubSet(arr1, arr2, n1, n2));

	}

}
