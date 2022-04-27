package ex02;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

/*
 * Bài 2: Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
Mật khẩu phải thỏa mãn các điều kiện sau đây. Lặp lại các bước kiểm tra điều kiện cho đến khi
đăng ký tài khoản thành công.

Nếu thông tin nhập vào không hợp lệ sẽ ném ra các ngoại lệ, lỗi tương ứng, sau đó thông báo
cho người dùng biết và cho phép nhập lại.
 */
public class Demo {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your password: ");
		String password;
		do {
			password = ip.next();
			try {
				checkPassword(password);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!checkPassword(password));
		System.out.println("Logged in successfully");
	}

	private static boolean checkPassword(String password) {

		if (password.length() < 8) {
			throw new RuntimeException("At least 8 character");
		}

		if (password.length() > 256) {
			throw new RuntimeException("At most 256 character");
		}

		int lowerCase = 0;
		for (int i = 0; i < password.length(); i++) {

			if (password.codePointAt(i) >= 97 && password.codePointAt(i) <= 122) {
				lowerCase++;
			}
		}

		if (lowerCase < 1) {
			throw new PassException(" At least 1 lowercase character");
		}

		int upperCase = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.codePointAt(i) >= 65 && password.codePointAt(i) <= 90) {
				upperCase++;
			}
		}

		if (upperCase < 1) {
			throw new PassException(" At least 1 uppercase character");
		}

		if (!password.matches("\\d+")) {
			throw new PassException(" At least 1 number");
		}

		if (!password.matches("[^\\\\s\\\\w]*")) {
			throw new PassException("At least 1 special character");
		}
		return true;
	}
}
