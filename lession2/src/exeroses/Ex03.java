package exeroses;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex03 {
	
	private static Random rd = new Random();
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "417";
	
	public static void main(String[] args) {
		// copy >> block scope
		// let >> block
		// var >> function
		//1000, 3 digits 10^3
		String[] generatedPassword = new String[1000];
		int i =0;
		String text = null;
		int breakAble = 1;
		do {
			//Random a number with 3 digits =>> 010 050 563 000
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			
			if(contains(generatedPassword,text,i)) {
				continue;
			}
			generatedPassword[i++] = text;
			
			System.out.print(text + "  ");
			if(breakAble++ % 12 == 0) {
				System.out.println();
			}
			sleep(10);
		}while(!login("admin",text));
		System.out.println();
		System.out.println("==>> Login sucessful <<==");
		System.out.println("Accout : " + "admin");
		System.out.println("Passwork : " + text);
	}
	private static boolean contains(String[] generatedPasswords, String text, int nonNullElements) {
		// for-index, for each
		for(int i=0; i<nonNullElements; i++) {
			String generatedPasswork = generatedPasswords[i];
			if(generatedPasswords.equals(text)) {
				return true;
			}
		}
		return false;
	}
	//TODO: Lession06-Exception
	private static void sleep(long milliseconds) {
			try {
				TimeUnit.MILLISECONDS.sleep(milliseconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	private static boolean login(String ipUsername, String ipPasswork) {
		//equals >> compare values in heap memory
		return ipUsername.equals(USERNAME) && ipPasswork.equals(PASSWORD);
	}
}
