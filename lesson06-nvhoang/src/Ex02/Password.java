package Ex02;

import java.util.Scanner;

public class Password {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter password : ");
		String password;
		do {
			password = input.nextLine();
			try {
				checkPassword(password);
				break;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				System.out.print("Enter again password: ");
			}

		} while (true);
		System.out.println("Complete ");
	}

	private static boolean checkPassword(String password) {
		if (password.length() < 8 || password.length() > 256) {
			throw new RuntimeException("At least 8 or most 256 character");
		}
		int lowerCase = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.codePointAt(i) <= 122 && password.codePointAt(i) >= 97) {
				lowerCase++;
			}
		}
		if (lowerCase < 1) {
			throw new PassException(" At least a lowercase character");
		}
		int upperCase = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.codePointAt(i) <= 90 && password.codePointAt(i) >= 65) {
				upperCase++;
			}
		}
		if (upperCase < 1) {
			throw new PassException(" At least a uppercase character");
		}
		if (!password.matches("\\d+")) {
			throw new PassException(" At least a number");
		}
		if (!password.matches("[^\\\\s\\\\w]*")) {
			throw new PassException("At least a special character");
		}

		return true;
	}
}
