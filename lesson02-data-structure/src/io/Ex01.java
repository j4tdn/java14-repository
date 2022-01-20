package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter your firt name:");
		String firstName = ip.nextLine();

		System.out.println("Enter your lastName: ");
		String lastName = ip.nextLine();
		
		System.out.println("enter your age ");
		int age = ip.nextInt();
		System.out.println("Age:" + age);

		System.out.println("Enter something: ");
		String emptyText = ip.nextLine();
		
		
		System.out.println("FullName: " + (firstName + lastName));
		System.out.println("emptyText ||| " + emptyText + "|||");
		
		
	}
}
