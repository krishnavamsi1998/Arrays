package ArrayConcept;

import java.util.HashMap;

//O(m+n),O(min(m,n))
//we are using min sized array into hashmap

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		
		
		 int[] ans=intersect(nums1,nums2);
	        for(int x:ans)
	            System.out.print(x+" ");
		

	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		//get min length array in place of nums1
		 if(nums1.length>nums2.length){
	            return intersect(nums2,nums1);
	        }
		 
	        HashMap<Integer,Integer>  map= new HashMap<Integer,Integer>();
	        
	        //getOrDefault : if value for key is not found then it will get the default value
	        
	        for(int val:nums1){
	            map.put(val,map.getOrDefault(val,0)+1);
	        }
	        
	        int k=0;
	        
	        for(int val:nums2){
	        	//if its positive
	            if(map.getOrDefault(val,0)>0){
	            	//copy duplicated values to result
	                nums1[k++]=val;
	                //we transffered to result , now we don't need that hence make it count to 0
	                map.put(val,0);
	            }
	        }
	        
	        int ans[]=new int[k];
	        
	        for(int i=0;i<k;i++){
	            ans[i]=nums1[i];
	        }
	        return ans;
		
	}

	
}
