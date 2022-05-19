package ex03;
/*
  Bài 3(20đ): Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
Example: input: Welcome to JAVA10 class
output: emocleW ot 01AVAJ ssalc
Method signature: revert(String s) >> String
 */
public class Ex03 {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		revertString(input);
	}

	private static String revertString(String input) {
		String string = input;
		string = string.replaceAll("[,\\s]+", " ").trim();
		String[] words = string.split(" ");
		string = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revertWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revertWord += word.charAt(j);
			}
			string = string + revertWord + " ";
		}
		System.out.println(string);

		return string;
	}
}