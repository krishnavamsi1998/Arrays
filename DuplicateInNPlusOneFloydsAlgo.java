package ArrayConcept;

//1 to N of size N+1 array ,find duplicate
//O(n),O(1)
public class DuplicateInNPlusOneFloydsAlgo {

	public static void main(String[] args) {

		int[] nums = { 3, 1, 3, 4, 2 };

		int slow = nums[0];
		int fast = nums[0];

		// loop till they collide

		do {

			slow = nums[slow];
			fast = nums[nums[fast]];

		} while (slow != fast);

		// then make slow or fast to start point
		fast = nums[0];

		// increment one step till they get equal
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		// result is slow or fast since both contains duplicate

		System.out.println(slow);

	}

}
