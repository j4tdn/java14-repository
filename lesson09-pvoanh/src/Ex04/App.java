package Ex04;

import java.util.Scanner;

public class App {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter your account name: ");
		String acName=sc.next();
		System.out.println("enter your password: ");
		String pw=sc.next();
		try {
			System.out.println(login(acName, pw));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String login(String ac,String pw) throws Exception {
		if(pw.length()<8) {
			throw new Exception("length of password must be at least 8 characters");
		}
		int letters=0;
		for(int i=0;i<pw.length();i++) {
			if(pw.charAt(i) >=48 && pw.charAt(i)<=57 || pw.charAt(i)>=65&& pw.charAt(i)<=90 || pw.charAt(i)>=97&& pw.charAt(i)<=122) {
				letters++;
			}
		}
		if(letters==pw.length()) {
			throw new Exception("password have at least a special letter");
		}
		int contain=0;
		for(int i=0;i<pw.length();i++) {
			if (contains(ac, pw.charAt(i))) {
				contain++;
			}
		}
		if(contain>3) {
			throw new Exception("account name is display out of 3 letters in pw");
		}
		return "Login succesfull";
	}
	private static boolean contains(String s,Character c) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				return true;
			}
		}
		return false;
	}
}
