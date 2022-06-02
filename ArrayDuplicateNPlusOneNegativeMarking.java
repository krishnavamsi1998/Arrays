package ArrayConcept;

//O(n),O(1)
//will mark negative and if we encounter negative again that means its has two incoming edges
//return the index of that 
//*this is applicable if they say array can be modified 

public class ArrayDuplicateNPlusOneNegativeMarking {

	public static void main(String[] args) {

		int[] nums = { 1,3,4,2,2 };
		int n = nums.length;
		/*
		 * for (int i = 0; i < n; i++) { if (nums[Math.abs(nums[i])] > 0)
		 * nums[Math.abs(nums[i])] = -1 * nums[Math.abs(nums[i])]; else {
		 * System.out.println(Math.abs(nums[i])); break; } }
		 */
		int res=nums[0];
		while(nums[Math.abs(res)]>0) {
			nums[Math.abs(res)]= -1*nums[Math.abs(res)];
			res=nums[Math.abs(res)];
		}
		System.out.println(Math.abs(res));
	}

}
