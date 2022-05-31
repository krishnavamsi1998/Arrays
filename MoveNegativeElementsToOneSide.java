
//use extra array
//O(n),O(n)

public class MoveNegativeElementsToOneSide {

	public static void main(String[] args) {
		
		
		int[] arr= {4,-9,5,-10};
		
		int n=arr.length;
		
		int[] resultArr=new int[n];
		int j=0;
		for(int i:arr) {
			if(i<0)
				resultArr[j++]=i;
				
		}
		for(int i:arr) {
			if(i>0)
				resultArr[j++]=i;
		}
		
		for(int i:resultArr)
			System.out.print(i+" ");

	}

}
