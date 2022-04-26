package baitap2;

import java.util.Scanner;

public class CheckValidityPassword {
	private static Scanner input = new Scanner(System.in);
	private static final String regexOneLower = ".*[a-z]+.*";
	private static final String regexOneUpper = ".*[A-Z]+.*";
	private static final String regexOneNumber = ".*\\d+.*";
	private static final String regexOnePecial = ".*[^\\w].*";

	public static void main(String[] args) {
		System.out.print("Enter password : ");
		String password = null;
		String result = null;
		do {
			try {
				password = input.nextLine();
				result = checkPassword(password);
				break;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				System.out.print("Enter again password: ");
			}

		} while (true);
		System.out.println("Result: " + result);
	}

	private static String checkPassword(String password) {
		String valid = "";
		int length = password.length();
		if (length < 8 || length > 256) {
			throw new RuntimeException("At least 8 or most 256 character");
		} else if (!checkLeastLower(password, regexOneLower)) {
			throw new RuntimeException("At least one lowercase alphabetic character");
		} else if (!checkLeastUp(password, regexOneUpper)) {
			throw new RuntimeException("At least one uppercase alphabetic character");
		} else if (!checkLeastNumber(password, regexOneNumber)) {
			throw new RuntimeException("At least one number character");
		} else if(!checkSpecial(password, regexOnePecial)) {
			throw new RuntimeException("At least one special character");
		}
		return valid = "Password Contain";
	}

	private static boolean checkLeastLower(String password, String regex) {
		return password.matches(regex);
	}

	private static boolean checkLeastUp(String password, String regex) {
		return password.matches(regex);
	}

	private static boolean checkLeastNumber(String password, String regex) {
		return password.matches(regex);
	}

	private static boolean checkSpecial(String password, String regex) {
		return password.matches(regex);
	}

//	private static boolean checkLeastLower(String password) {
//		boolean check = false;
//		int count = 0;
//		for (int i = 0; i < password.length(); i++) {
//			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
//				count++;
//			}
//		}
//		check = (count != 0) ? true : false;
//		return check;
//	}

//	private static boolean checkLeastUp(String password) {
//		boolean check = false;
//		int count = 0;
//		for (int i = 0; i < password.length(); i++) {
//			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
//				count++;
//			}
//		}
//		check = (count != 0) ? true : false;
//		return check;
//	}

//	private static boolean checkLeastNumber(String password) {
//		boolean check = false;
//		int count = 0;
//		for (int i = 0; i < password.length(); i++) {
//			if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
//				count++;
//			}
//		}
//		check = (count != 0) ? true : false;
//		return check;
//	}

//	private static boolean checkSpecial(String password) {
//		// !@#&()–[{}]:;',?/*~$^+=<>
//		Character[] specials = { '!', '@', '#', '&', '(', ')', '-', '[', ']', '{', '}', ':', ';', '"', '?', '/', '*',
//				'~', '$', '^', '+', '=', '<', '>' };
//		boolean check = false;
//		int count = 0;
//		for (int i = 0; i < password.length(); i++) {
//			for (Character special : specials) {
//				if (password.charAt(i) == special) {
//					count++;
//				}
//			}
//		}
//		check = (count != 0) ? true : false;
//		return check;
//	}

}
