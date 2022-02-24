package exercises;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex03 {

	private static Random rd = new Random();
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "417";

	public static void main(String[] args) {
		String[] generatedPasswords = new String[1000];
		int i = 0;
		
		String text = null;
		int breakAble = 1;
		do {

			// random a number with 3 digits
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);

			if(contains(generatedPasswords,text,i)) {
				continue;
			}
			
			generatedPasswords[i++]= text;
			
			
			System.out.print(text + " ");
			if (breakAble++ % 12 == 0) {
				System.out.println();
			}
			sleep(10);
		} while (!login("admin", text));
		
		System.out.println("\n===> Login successfu <====");
	}
	
	
	private static boolean contains(String[] generatedPasswords, String text,int isNonNullElements) {
		for(int i=0;i<isNonNullElements;i++) {
			String generatedPassword = generatedPasswords[i];
			if(generatedPassword.equals(text)) {
				return true;
			}
		}
		return false;
	}


	//TODO : Lesson06-Exeption
	private static void sleep(long miliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(miliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static boolean login(String ipUsername, String ipPassword) {
		return ipUsername.equals(USERNAME) && ipPassword.equals(PASSWORD);
	}

}
