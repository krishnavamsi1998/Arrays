package arrays;

public class ExtractDigitFromString {

	public static void main(String[] args) {

		String str = "vamsi1234";
		
		//regex for replace all non digit with empty string
		str = str.replaceAll("\\D", "");
		int value = Integer.parseInt(str);

		System.out.println(value);

	}

}
