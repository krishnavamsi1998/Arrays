
//0,1,2 ka problem
//put counters and fill 
//O(N),O(1)
//here we are traversing the array twice 
// cloud you traverse only once ?

public class SortColorsUsingCount {

	public static void main(String[] args) {
		
		int[] arr= {0,1,0,2,1,1,1,2,0,1,1,0,2};
		int n=arr.length;
		int c0,c1,c2;
		c0=c1=c2=0;
		
		for(int i:arr) {
			if(i==0)
				c0++;
			if(i==1)
				c1++;
			if(i==2);
				c2++;
				
		}
		
		for(int i=0;i<n;i++) {
			if(i<c0)
				arr[i]=0;
			if(i>=c0 && i<c0+c1)
				arr[i]=1;
			if(i>=c0+c1 && i<c0+c1+c2)
				arr[i]=2;
		}
		for(int i:arr)
			System.out.print(i+" ");
				
		

	}

}
