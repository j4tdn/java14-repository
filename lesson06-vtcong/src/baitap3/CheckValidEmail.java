package baitap3;

import java.util.Scanner;

public class CheckValidEmail {
	private static Scanner input = new Scanner(System.in);
	private static final String emailPartern = "[a-z]+[.-_][a-z]+@([a-z]+.[a-z]+)$";

	public static void main(String[] args) {
		String email = null;
		do {
			System.out.print("Enter email : ");
			email = input.nextLine();
			if (email.matches(emailPartern)) {
				break;
			}

			System.out.println("Email not valid");

		} while (true);
		
		System.out.println("Email is valid");

	}

}
