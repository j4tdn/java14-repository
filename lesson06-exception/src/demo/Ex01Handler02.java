package demo;

import java.util.Scanner;

public class Ex01Handler02 {
	private static Scanner ip= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		int number= Integer.parseInt(ip.nextLine());
		
		System.out.println("value "+ number);
		System.out.println("double value :"+Math.pow(number, 2));
	}
}	
