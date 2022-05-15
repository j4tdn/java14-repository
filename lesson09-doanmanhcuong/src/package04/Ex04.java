package package04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		String password;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhap ten tai khoan: ");
		sc.nextLine();
		System.out.println("nhap mat khau");
		password = sc.nextLine();
		if (isValid(password)) {
			System.out.println(" dang ki tai khoan thanh cong");
		} else {
			System.out.println( " dang ki tai khoan that bai");
		}
	}

	public static boolean isValid(String password) {
		if (!((password.length() >= 8))) {
			return false;
		}
		if (password.contains(" ")) {
			return false;
		}
		if (true) {
			int count = 0;
			for (int i = 0; i <= 9; i++) {
				String str1 = Integer.toString(i);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~")
				|| password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&")
				|| password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-")
				|| password.contains("+") || password.contains("/") || password.contains(":") || password.contains(".")
				|| password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?")
				|| password.contains("|"))) {
			return true;
		}
		if (true) {
			int count = 0;
			for (int i = 65; i <= 90; i++) {
				char c = (char) i;
				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		if (true) {
			int count = 0;
			for (int i = 97; i <= 122; i++) {
				char c = (char) i;
				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		return true;
	}
}
