package arrays;

import java.util.ArrayList;

//Given an array a[] of size N which contains elements from 0 to N-1, 
//you need to find all the elements occurring more than once in the given array
//in sorted order
//O(n),O(n)

public class MultipleDuplicatesInSortedOrder {

	 public static ArrayList<Integer> duplicates(int arr[], int n) {
	        // code here
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        int[] a=new int[n];
	        
	        for(int i=0;i<n;i++)
	        {
	            a[arr[i]]+=1;
	        }
	        int flag=0;
	        //sorted order only we are traversing
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]>1)
	            {
	                flag=1;
	                list.add(i);
	            }
	            
	        }
	        if(flag==1)
	        return list;
	        else
	        {
	            list.add(-1);
	            return list;
	        }
	        
	    }
	 
	public static void main(String[] args) {
		
		int[] arr= {2,3,1,2,3};
		int n=arr.length;
		
		System.out.println(duplicates(arr,n));
		
	}

}
