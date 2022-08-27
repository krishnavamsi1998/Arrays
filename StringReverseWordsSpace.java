package arrays;

import java.util.Stack;

//O(n),O(n)

public class StringReverseWordsSpace {

	public static void main(String[] args) {

		String str = "Piniganti  Krishna  Vamsi";

		int n = str.length();
		String res = "";

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != ' ') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == ' ') {
				if (stack.size() != 0) {
					while (stack.size() != 0)
						res += stack.pop();
				}
				res += str.charAt(i);

			}
		}

		// for last word
		while (stack.size() != 0)
			res += stack.pop();

		System.out.println(res);

	}

}
