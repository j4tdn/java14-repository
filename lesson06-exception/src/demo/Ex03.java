package demo;
/**
 * Vượt quá kích thước mảng
 * @author Oanhpv1008
 *
 */
public class Ex03 {
	
	public static void main(String[] args) {
		String []elements= {"X123", "k27sds","asss22"};
		printf(elements);
	}
	private static void printf(String []elements) {
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			at demo.Ex03.printf(Ex03.java:15)
			at demo.Ex03.main(Ex03.java:11)
		 */
		for(int i=1;i<=elements.length;i++) {
			System.out.println(elements[i]);
		}
	}
}
