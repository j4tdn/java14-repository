package ex03;

public class App {
	public static void main(String[] args) {
		String s = "Welcome  to JAVA10  class";
		System.out.println(revert(s));
	}
	public static String revert(String s) {
		s = s.replaceAll("[\\s]+", " ");
		char[] chArray = s.toCharArray();
		String reverseStr="";
		for (int i = s.length()-1; i>=0; i--)
			reverseStr+=chArray[i];
		return reverseStr;
	}
}
