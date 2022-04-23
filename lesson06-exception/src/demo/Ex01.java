package demo;

import java.util.Scanner;

/**
 * bài toán: nhập vào số nguyên --> chuỗi
 */
public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number = Integer.parseInt(ip.nextLine());
		/**
		 * Khi code thực thi bị exception, Java(JVM) nó sẽ quăng ra thông tin của exception mình gặp
		 * và dừng toàn bộ chương trình.
		 * Expected: Khi mà bị exception thì xử lý lỗi, in ra thông tin lỗi cho người dùng và tiếp tục chương trình
		 * Exception in thread "main" java.lang.NumberFormatException:
		 * For input string: "6a" at
		 * java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		 * at java.base/java.lang.Integer.parseInt(Integer.java:660) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:778) at
		 * demo.Ex01.main(Ex01.java:13)
		 */
		System.out.println("============");
		System.out.println("Value: " + number);
		System.out.println("Double Value: " + Math.pow(number, 2));
	}
}
