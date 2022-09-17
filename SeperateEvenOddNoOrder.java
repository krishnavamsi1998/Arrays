package arrays;

//O(n),O(1)

public class SeperateEvenOddNoOrder {

	public static void main(String[] args) {
		
		int[] arr= {12, 34, 45, 9, 8, 90, 3};
		int n=arr.length;
		int l=0;
		int r=n-1;
		
		while(l<r)
		{
			if(arr[l]%2==0 && arr[r]%2==1)
			{
				l++;
				r--;
				
			}
			else if(arr[l]%2==0 && arr[r]%2==0)
			 l++;
			else if(arr[l]%2==1 && arr[r]%2==0)
			{
				swap(l,r,arr);
				l++;
				r--;
				
			}
			else if(arr[l]%2==1 && arr[r]%2==1)
			{
				r--;
			}

		}
		
		for(int i:arr)
			System.out.print(i+" ");
	}
	
	

	public static void swap(int i,int j,int[] arr)
	{
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}

}
