package demo;

/**
 * bài toán: vượt quá kích thước của mảng
 * --> tùy trường hợp mà xử lý chứ không nên lạm dụng try catch
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] elements = { "123", "fhaj", "42387" };
		printf(elements);
		/*
		 * fhaj 
		 * 42387 
		 * Exception in thread "main"
		 * java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		 * at demo.Ex03.printf(Ex03.java:16) at demo.Ex03.main(Ex03.java:11)
		 */
	}

	private static void printf(String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}
}
