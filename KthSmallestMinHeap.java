import java.util.PriorityQueue;


// O(n) - for building heap
//O(k-1*logn)=O(klogn)
//O(n+klogn)
//space -?
public class KthSmallestMinHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,6,3,2,7,99,-2};
		int k=3;
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		for(int i:arr)
			pq.add(i);
		
		//remove min element exactly k-1 times
		for(int i=0;i<k-1;i++)
			pq.poll();
		
		//get root	
		System.out.println(pq.peek());
		

	}

}
