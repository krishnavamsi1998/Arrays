package ArrayConcept;

import java.util.Arrays;
//arr1 =1 3 5 7;
//arr2=0 2 6 8 9;
//op : 0 1 2 3 5 6 7 8 9 
//time complexity =?,space =O(1) , use a sorting algo which takes O(1) space

public class MergeTwoSortedArrayWithoutExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { -7, 12, 17, 29, 41, 56, 79 };
		int[] arr2 = { -9, -3, 0, 5, 19 };
		int n = arr1.length;
		int m = arr2.length;

		int i, j;
		i = n - 1;
		j = 0;
		int t;
		while (i >= 0 && j < m) {
			if (arr1[i] > arr2[j]) {
				t = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = t;
				i--;
				j++;

			}//if they are already in correct pos then we break  
			else
				break;

		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));

	}

}
