package ex02;

public class Ex02LargeNumber {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		String[] number = new String[10];
		for (int i = 0; i < s1.length(); i++) {
			String temp = "";
			if(s1.charAt(i) >= '0' && s1.charAt(i) <='9') {
				temp+=s1.charAt(i);
			}
			number[]
		}
		for (Character c : s1.toCharArray()) {
			String str = "";
			if (c.isDigit(c)) {
				str += c;
			}
		}

		System.out.println(str);
	}

	private static String[] getLargestNumbers(String... ss) {
		String[] number = new String[ss.length];

		return number;
	}
}
