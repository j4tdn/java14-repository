package ex03;

public class Ex03Revert {
	public static void main(String[] args) {
		String str = "Welcome to JAVA10 class";
		str = revert(str);
		System.out.println(str);
	}
	
	private static String revert(String str) {
		str = str.replaceAll("\\s+", " ");
		StringBuilder strB = new StringBuilder(str);
		strB.reverse();
		return strB.toString();
	}
}