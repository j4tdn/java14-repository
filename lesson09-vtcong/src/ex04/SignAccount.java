package ex04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignAccount {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		signAccount();
	}

	private static void signAccount() {
		String userName;
		String passWord;
		System.out.print("input username: ");
		userName = input.nextLine();
		do {
			System.out.print("input passord: ");
			passWord = input.nextLine();
			if (!checkPassword(passWord,userName)) {
				System.out.println("not validated");
				continue;
			}
			break;
		} while (true);
		System.out.println("sign success");
	}

	private static boolean checkPassword(String password,String user) {
		Pattern special = Pattern.compile("[~!@#$%^&*]");
		Pattern number = Pattern.compile("[0-9]");
		Pattern upper = Pattern.compile("[A-Z]");
		Matcher matcherSpecial = special.matcher(password);
		Matcher matcherNumber = number.matcher(password);
		Matcher matcherUpper = upper.matcher(password);

		if (password.length() > 8 && matcherSpecial.find() && matcherNumber.find() && matcherUpper.find() && !checkThreeCharacter(user,password)) {
			return true;
		} else
			return false;
	}

	private static boolean checkThreeCharacter(String user, String pass) {
		int count = 0;
		for (Character u : user.toCharArray()) {
			for (Character p : pass.toCharArray()) {
				if (p == u) {
					count++;
				}
			}
		}
		if (count >= 3) {
			return true;
		} else
			return false;
	}
}
