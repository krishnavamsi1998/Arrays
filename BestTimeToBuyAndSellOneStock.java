package ArrayConcept;
//O(n),O(1)
//buy and sell only one stock

public class BestTimeToBuyAndSellOneStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7, 1, 5, 3, 6, 4 };
		int n=arr.length;
		int min=Integer.MAX_VALUE;
		int max=0;
		
		for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
                min=arr[i];
            else if(arr[i]-min>max)
                max=arr[i]-min;
        }
		System.out.println(max);
        

	}

}
