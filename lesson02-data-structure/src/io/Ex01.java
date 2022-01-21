package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName = ip.nextLine();
		
		
		System.out.println("Enter your Last name");
		String lastName = ip.nextLine();
		
		
		System.out.println("Enter your age");
		int age = Integer.parseInt(ip.nextLine());
		System.out.println("fullname: "+(firstName + lastName + age));
		
	}
	
	
}
