
//O(n), O(n)


public class ReverseArray {

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,7,9};
		int[] arrReversed=new int[arr.length];
		
		
		
		for(int i=arr.length-1,j=0; i>=0 && j<arrReversed.length; i--,j++) 
			
			arrReversed[j]=arr[i];

		
			
		for(int k:arrReversed)
			System.out.print(k+" ");

	}

}
