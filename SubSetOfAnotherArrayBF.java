package ArrayConcept;
//Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
//Output: arr2[] is a subset of arr1[]

//O(m*n),O(1)

public class SubSetOfAnotherArrayBF {

	public static void main(String[] args) {

		int[] arr1 = {10, 5, 2, 23, 19};
		int[] arr2= {19, 5, 3};
		
		int n1=arr1.length;
		int n2=arr2.length;
		
		System.out.println(isSubSet(arr1,arr2,n1,n2));
		
	}

	private static boolean isSubSet(int[] arr1, int[] arr2, int n1, int n2) {
		//for each element in arr2 we check if its present in arr1 or not
		
		for(int i=0;i<n2;i++)
			if(!isPresent(arr2[i],arr1,n1))
				return false;
		return true;
	}

	private static boolean isPresent(int k, int[] arr1, int n1) {
		
		for(int i=0;i<n1;i++)
		{
		if(arr1[i]==k)
			return true;
		}
		
		return false;
	}

}
