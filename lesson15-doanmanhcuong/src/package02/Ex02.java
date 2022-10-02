package package02;

public class Ex02 {
	 private static final int Char_SIZE = 256;
	public static void main(String args[]) {
		String str = "aaaababbbddc";
		System.out.println(getMaxOccurringChar(str));
	}

	private static char getMaxOccurringChar(String str) {
		int count[] = new int[Char_SIZE];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		int max = -1;
		char result = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
}
