package exercises;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex03 {
	private static Random rd = new Random();
	private static final String USENAME = "admin";
	private static final String PASSWORD = "417";

	public static void main(String[] args) {
		String []generatedPasswords = new String [1000];
		
		String text = null;
		int count=1;
		int  i=0;
		do {
			// random a number with 2 digits =>010 , 023
			text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			// check Ps isExited
			
			if(contains(generatedPasswords,text,i)) {
				continue;
			}
			generatedPasswords[i++]=text;
			System.out.print(text+" ");
//			sleep();
			if(count++ %12==0) {
				System.out.println();
				
			}
		} while (!login("admin", text));
		
		System.out.println("=>>> Login succesful !");
		System.out.println("Account: "+USENAME);
		System.out.println("Password: "+PASSWORD );

	}
	private static boolean contains(String[] generatedPasswords, String text, int nonNullElements) {
		for(int i=0;i<nonNullElements;i++) {
			if(generatedPasswords[i].equals(text)) {
				return true;
			}
		}
		return false;
	}
	
	private static void sleep(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static boolean login(String us, String pw) {
		return USENAME.equals(us) && PASSWORD.equals(pw);
	}
}
