package demo;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number = Integer.parseInt(ip.nextLine());
		
		
		System.out.println("=========");
		System.out.println("Value" + number);
		System.out.println("Double Value : " + Math.pow(number, 2));
	}
}
