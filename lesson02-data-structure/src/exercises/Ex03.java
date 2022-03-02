package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex03 {

	private static Random rd = new Random();
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "417";

	public static void main(String[] args) {
		// random a number with 3 digits
		String[] generatedPasswords = new String[1000];
		int i=0;
		
		String text = null;
		int breakAble = 1;
		do {
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			
			if(contains(generatedPasswords, text, i)) {
				continue;
			}
			
			generatedPasswords[i]=text;
			
			System.out.print(text + "  ");
			if (breakAble++ % 12 == 0) {
				System.out.println();
			}
			sleep(10);
		} while (!login("admin", text));

		System.out.println("\n====> login sucessful <====");
		System.out.println("Account: "+USERNAME+ " Password: "+PASSWORD);
		System.out.println("===================================");
	}
	
	private static boolean contains(String[] generatedPasswords, String text, int nonNullElements) {
		//for-index, for-each
		for(int i=0; i<nonNullElements; i++) {
			String generatedPassword = generatedPasswords[i];
			if(generatedPassword.equals(text)) {
				return true;
			}
		}
		return false;
	}

	//TODO: lesson06-Exception
	private static void sleep(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean login(String ipUsername, String ipPassword) {
		return ipUsername.equals(USERNAME) && ipPassword.equals(PASSWORD);
	}
}
