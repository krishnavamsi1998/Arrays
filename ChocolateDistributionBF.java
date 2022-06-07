package ArrayConcept;

import java.util.ArrayList;
import java.util.Collections;

//Given an array of n integers where each value represents the number of chocolates in a packet.
//Each packet can have a variable number of chocolates. There are m students, 
//the task is to distribute chocolate packets such that: 

//1.Each student gets one packet.
//2.The difference between the number of chocolates in the packet
//with maximum chocolates and packet with minimum chocolates given to the students is minimum.

//Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
//Output: Minimum Difference is 2 
//Explanation:
//We have seven packets of chocolates and 
//we need to pick three packets for 3 students 
//If we pick 2, 3 and 4, we get the minimum 
//difference between maximum and minimum packet 
//sizes.

//O(mn)+O(n*2^n)
//generate all subsets pick length m , find max and min and fetch the difference and make global difference

public class ChocolateDistributionBF {

	private static ArrayList<ArrayList<Integer>> getAllSubSets(int[] arr, int n) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> l;

		for (int i = 0; i < (1 << n); i++) {

			l = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0)
					l.add(arr[j]);
			}
			list.add(l);

		}

		return list;
	}

	public static void main(String[] args) {
		
		int[] arr = {3, 4, 1, 9, 56, 7, 9, 12 };
		int m = 5 ;
		int n = arr.length;

		// if no.of packets less than students
		if (n < m)
			System.out.println(-1);
		else {

			ArrayList<ArrayList<Integer>> list;
			list = getAllSubSets(arr, n);
		
			int globaldiff = Integer.MAX_VALUE;
			int localdiff = 0;
			int max, min;
			max = min = 0;
			for (ArrayList<Integer> arlist : list) {
				
				if (arlist.size() == m) {
					max = Collections.max(arlist);
					min = Collections.min(arlist);
					localdiff = (max - min);
					globaldiff = globaldiff > localdiff ? localdiff : globaldiff;

				}

				
			}
			System.out.println(globaldiff);

		}

	}

}
