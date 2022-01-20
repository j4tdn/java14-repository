package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter your first name: ");
		String firstName = ip.nextLine();

		System.out.println("Enter your last name: ");
		String lastName = ip.nextLine();

		System.out.println("Enter your age: ");
		int age = Integer.parseInt(ip.nextLine());
		System.out.println("Age: " + age);

		System.out.println("Enter something: ");
		String emptyText = ip.nextLine();

		System.out.println("Fullname: " + (firstName + lastName));
		System.out.println("empty |||" + emptyText + "|||");

	}

}
