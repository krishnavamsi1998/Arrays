package ArrayConcept;

import java.util.HashMap;

//O(n),O(n)

public class AppearMoreThanNByKTimes {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
		int n = arr.length;

		int k = 4;

		int v = n / k;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);

		}
		for (Integer key : map.keySet()) {
			if (map.get(key) > v)
				System.out.print(key + " ");
		}

	}

}
