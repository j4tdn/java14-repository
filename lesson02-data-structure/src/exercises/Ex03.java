package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex03 {
	
	private static Random rd = new Random();
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "417";
	
	public static void main(String[] args) {
		// 1000, 3 digits 10^3
		// null,.....999...null
		String[] generatedPasswords = new String[1000];
		int i = 0;
		
		String text = null;
		int breakAble = 1;
		do {
			// Random a number with 3 digits ==> 010 050 563 000
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if (contains(generatedPasswords, text, i)) {
				continue;
			}
			// Đưa vào mảng
			generatedPasswords[i++] = text;
			
			// In ra
			System.out.print(text + "   ");
			if(breakAble++ % 12 == 0) {
				System.out.println();
			}
			sleep(10);
			
			// Kiểm tra mật khẩu đúng chưa
		} while(!login("admin", text));
		
		System.out.println("\n====> Login sucessful <=====");
		System.out.println("Account: " + "admin");
		System.out.println("Password: " + text);
		
	}
	
	private static boolean contains(String[] generatedPasswords, String text, int nonNullElements) {
		// for-index, for-each
		for (int i = 0; i < nonNullElements; i++) {
			String generatedPassword = generatedPasswords[i];
			if (generatedPassword.equals(text)) {
				return true;
			}
		}
		return false;
	}

	// TODO: Lesson06-Exception >>>>
	private static void sleep(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean login(String ipUsername, String ipPassword) {
		// equals >> compare values in heap memory
		return ipUsername.equals(USERNAME) && ipPassword.equals(PASSWORD);
	}
}