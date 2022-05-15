package demo;

import java.util.Scanner;

//bai toan : phep chia so nguyen cho 0

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a : ");
		int a = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter b : ");
		int b = Integer.parseInt(ip.nextLine());
		
		int result = divide(a, b);
		System.out.println("Result: " + result);
	}
	
	private static int divide(int a, int b) {
		/**
		 
		 */
		return a/b;
	}
}
