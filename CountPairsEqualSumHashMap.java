package ArrayConcept;

import java.util.HashMap;

//O(n),O(1)
public class CountPairsEqualSumHashMap {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int n = arr.length;
		int k = 6;
		int c = 0;

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			if (m.containsKey(arr[i]))
				m.put(arr[i], m.get(arr[i]) + 1);
			else
				m.put(arr[i], 1);
		}

		// we are counting (1,5) and (5,1) also, so we need to do count/2
		for (int i = 0; i < n; i++) {

			c += m.get(k - arr[i]);
			if (k - arr[i] == arr[i])
				c--;

		}

		System.out.println(c / 2);

	}

}
