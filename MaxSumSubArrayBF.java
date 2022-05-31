package demoproj;

//Given an integer array nums, find the contiguous subarray
//(containing at least one number) which has the largest sum and return its sum.
//O(n3)
public class MaxSumSubArrayBF {

	public static void main(String[] args) {

		int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++) {
				
				sum=0;
				for(int k=i;k<=j;k++) {
					
					sum+=arr[k];
							
					
				}
				maxSum= maxSum<sum ? sum:maxSum;
			}
		}
		System.out.println(maxSum);
	}

}
