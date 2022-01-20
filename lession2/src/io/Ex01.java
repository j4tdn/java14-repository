package io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first name : ");
		String firstName = sc.nextLine();
		
		System.out.print("Enter your first name : ");
		String lastName = sc.nextLine();
		
		System.out.print("Enter something : ");
		String emptyText = sc.nextLine();
		
		System.out.print("Enter your age");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Age " + age);
		
		System.out.println("Full name : " + (firstName + " " +  lastName));
		System.out.println("empty Text ||| " + emptyText + "|||");
		
	
	}

}
