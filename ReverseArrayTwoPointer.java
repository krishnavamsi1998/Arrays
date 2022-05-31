

//O(n),O(1)
public class ReverseArrayTwoPointer {

	public static void main(String[] args) {
		int[] arr= {1,2,3,78,4,7,9};
		
		int n=arr.length;
		int left=0;
		int right=n-1;
		int temp=0;
		
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
		for(int i:arr)
			System.out.print(i+" ");

	}

}
