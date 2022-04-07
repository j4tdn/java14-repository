package demo;

import java.util.Scanner;

/**
 * Phép toán chia nguyên cho 0
 * 
 * @author Oanhpv1008
 *
 */
public class Ex02 {
	private static Scanner ip= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a: ");
		int a= Integer.parseInt(ip.nextLine());
		System.out.println("enter b: ");
		int b= Integer.parseInt(ip.nextLine());
		
		int rs= devide(a, b);
		System.out.println("Rs: "+rs);
	}

	private static int devide(int a, int b) {
		/*
			Exception in thread "main" java.lang.ArithmeticException: / by zero
			at demo.Ex02.devide(Ex02.java:24)
			at demo.Ex02.main(Ex02.java:19)

		 */
		return a / b;
	}
}
