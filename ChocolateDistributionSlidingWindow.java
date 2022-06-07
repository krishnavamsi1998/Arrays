package ArrayConcept;

import java.util.Arrays;

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

//approach:

//first sort the array and slide window , end window element is max and start window element is min 
//get the difference

//O(n)+O(nlogn) =O(nlogn) , O(1)

public class ChocolateDistributionSlidingWindow {

	public static void main(String[] args) {

		int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
		int m = 3;

		int n = arr.length;

		Arrays.sort(arr);

		int globalDifference = Integer.MAX_VALUE;
		int localDifference = 0;
		int max, min;
		max = min = 0;

		for (int i = 0; i + m - 1 < n; i++) {
			// max element in window
			max = arr[i + m - 1];
			// min element in window
			min = arr[i];
			localDifference = max - min;

			globalDifference = globalDifference > localDifference ? localDifference : globalDifference;
		}

		System.out.println(globalDifference);

	}

}
