package io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = ip.nextLine();
		
		System.out.print("Enter your age: ");
		//int age = ip.nextInt();
		//Fix
		// Cach 1
		//int age = ip.nextInt();
		//ip.nextLine();
		//Cach 2
		int age = Integer.parseInt(ip.nextLine());
		System.out.println("Age "+age);
		
		
		System.out.print("Enter something:  ");
		String emtyText = ip.nextLine();
		
		System.out.println("Full: " + firstName + lastName);
		System.out.println("emtyText|||"+ emtyText + "|||");
	
		
		
	}

}
