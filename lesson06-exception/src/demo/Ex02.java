package demo;

import java.util.Scanner;

/**
 * Bài toán: Phép toán chia số nguyên cho 0
 */
public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter b: ");
		int b = Integer.parseInt(ip.nextLine());
		
		System.out.println("=========");
		
		int result = divide(a, b);
		System.out.println("Result: " + result);
	}
	
	private static int divide(int a, int b) {
		/*
			Exception in thread "main" java.lang.ArithmeticException: divide by zero
			at demo.Ex02.divide(Ex02.java:26)
			at demo.Ex02.main(Ex02.java:21)
		 */
		return a/b;
	}
}
