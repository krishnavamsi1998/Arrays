package ArrayConcept;
//O(n2),O(1)

public class CountPairsWithGivenSumBF {

	public static void main(String[] args) {

		int[] arr= {1,1,1,1};
		int n=arr.length;
		int k=2;
		int sum=countPairs(arr,n,k);
		System.out.println(sum);
		
	}

	private static int countPairs(int[] arr, int n,int k) {
		int s=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==k)
					s+=1;
			}
		}
		
		return s;
	}

}
