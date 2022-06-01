package ArrayConcept;
//O(n),O(1)
public class JumpGame {

	public static void main(String[] args) {
		
		int[] arr= {3,2,1,0,4};
		
		System.out.println(canJump(arr));
		

	}
	 public static boolean canJump(int[] nums) {
	        int reachable=0;
	        int n=nums.length;
	        for(int i=0;i<n;i++){
	            //not possible
	            if(i>reachable)
	                return false;
	            reachable=Math.max(reachable,i+nums[i]);
	            
	        }
	        return true;
	        
	    }
}
