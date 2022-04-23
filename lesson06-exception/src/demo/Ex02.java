package demo;

import java.util.Scanner;

/*
 * bài toán: lỗi chia số nguyên cho 0
 *
 */
public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());
		System.out.println("Enter b: ");
		int b = Integer.parseInt(ip.nextLine());
		
		System.out.println("===========");
		int result = divide(a, b);
		System.out.println("Result: " + result);
	}

	private static int divide(int a, int b) {
		/*
		 * Enter a: 9 
		 * Enter b: 0 
		 * =========== 
		 * Exception in thread "main"
		 * java.lang.ArithmeticException: divide by zero at demo.Ex02.divide(Ex02.java:23) at
		 * demo.Ex02.main(Ex02.java:18)
		 */
		return a / b;
	}
}
