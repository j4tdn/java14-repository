package demo;

/**
 * Bài toán: Vượt quá kích thước mảng
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] elements = {"X123", "k27xi", "Z81jc"};
		printf(elements);
	}
	
	private static void printf(String[] elements) {
		/*
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 3
			at demo.Ex03.printf(Ex03.java:14)
			at demo.Ex03.main(Ex03.java:9)
		 */
		for (int i = 1; i <= elements.length; i++) {
			System.out.println(elements[i]);
		}
	}
}