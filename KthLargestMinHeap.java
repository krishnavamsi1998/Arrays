package ArrayConcept;

import java.util.PriorityQueue;

//adding element in min heap takes log n time
//O(klogk) -for pushing k elements ; O((n-k)logk)
//O(nlogk +O(klogk)-O(klogk)) = O(nlogk)

public class KthLargestMinHeap {

	public static void main(String[] args) {
		int[] arr= {7, 4, 6, 3, 9, 1};
		int k=3;// kth largest
		
		 int n=arr.length;
	        //stores the top K elements where last highest number will be the root
	        PriorityQueue<Integer> pq=new PriorityQueue<>();
	        
	        for(int i=0;i<n;i++){
	            pq.add(arr[i]);
	            if(pq.size()>k)
	                //removes the min element
	                pq.poll();
	        }
	        //gets the root element
	    System.out.println(pq.peek());
		 
	    
	    // similar but more understandable	
		
		
		
		//min heap
		PriorityQueue<Integer> pqq=new PriorityQueue<>();
		
		
		
		
		
		
		//push first k elements to the pq
		
		for(int i=0;i<k;i++)
			pqq.add(arr[i]);
		
		
		//compare from k+1 element with peek of the queue
		
		for(int i=k;i<arr.length;i++)
		{
			//if current element is greater than root element
			if(pqq.peek()<arr[i]) {
				//replace root ele with current element
				pqq.poll();
				pqq.add(arr[i]);
				
			}
			else
				//do nothing
				continue;
		}
		
		System.out.println(pq.peek());
		

	}

}
