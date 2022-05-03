package ex02;

import java.util.Scanner;

public class Checkpass {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String password = null;
		System.out.println("enter the password:");
		

		do {
			password = input.nextLine();
			try {
				checkPass(password) ;
					break;
				

			} catch (NumberFormatException n) {
				System.out.println("enter the password again ,"+n.getMessage());
			}

		} while (true);

		System.out.println("succes: "+ password);

	}

	public static boolean checkPass(String password) {

		if (password.length() < 8 || password.length() > 255) {
			throw new NumberFormatException("Invalid password, at least 8 charactor and at most 255 charactor");
		}

		if (!password.matches(".*[a-z].*")) {
			throw new NumberFormatException("Invalid password, at least 1 lower case");

		}

		if (!password.matches(".*[A-Z].*")) {
			throw new NumberFormatException("Invalid password, at least 1 Up case");

		}

		if (!password.matches(".*\\d+.*")) {
			throw new NumberFormatException("Invalid password, at least 1 digit");
		}

		if (!password.matches(".*[^\\w].*")) {
			throw new NumberFormatException("Invalid password, at least 1 special character");
		}

		return true;
	}
}
