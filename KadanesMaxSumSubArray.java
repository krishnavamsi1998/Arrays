package ArrayConcept;


//O(n)
//initialize local and global sum to arr[0]
//local sum = max( current element + local sum , current element)
//compare with global sum with local sum and update global sum

public class KadanesMaxSumSubArray {

	public static void main(String[] args) {

		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int n = arr.length;

		int localSum = arr[0];
		int globalSum = localSum;

		for (int i = 1; i < n; i++) {
			
			localSum=Math.max(localSum + arr[i], arr[i]);
			
			globalSum=Math.max(localSum, globalSum);
		}
		
		System.out.println(globalSum);

	}

}
