//O(n),O(1)
//both are pos->right--
//both are neg->left++
//left is pos and right is neg -> swap and left++,right--
//left is neg and right is pos -> left++,right--
public class MoveNegativeElementsToBeginningTwoPointer {

	public static void main(String[] args) {

		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };
		int n = arr.length;

		int left = 0;
		int right = n - 1;

		moveElements(arr, left, right);

		for (int i : arr)
			System.out.print(i + " ");

	}

	private static void moveElements(int[] arr, int left, int right) {

		while (left < right) {

			if (arr[left] > 0 && arr[right] > 0)
				right--;

			if (arr[left] < 0 && arr[right] < 0)
				left++;

			if (arr[left] < 0 && arr[right] > 0) {
				left++;
				right--;
			}

			if (arr[left] > 0 && arr[right] < 0) {
				swap(arr, left, right);
				left++;
				right--;
			}

		}

	}

	private static void swap(int[] arr, int left, int right) {

		int t = arr[left];
		arr[left] = arr[right];
		arr[right] = t;

	}

}
