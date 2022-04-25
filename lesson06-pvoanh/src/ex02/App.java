package ex02;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter your password: ");
		String pw;
		do {
			pw=sc.next();
			try {
				checkPassWordIsValid(pw);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}while(!checkPassWordIsValid(pw));
		System.out.println("login is completed!");
		
	}
	private static boolean checkPassWordIsValid(String pw){
		if(pw.length()<8 ) {
			throw new PassWordException("password must have at least 8 characters");
		}
		if(pw.length()>256) {
			throw new PassWordException("password must have at most 256 characters");
		}
		int lowerCase=0;
		for(int i=0;i<pw.length();i++) {
			if(pw.codePointAt(i) <=122 && pw.codePointAt(i)>=97) {
				lowerCase++;
			}
		}
		if(lowerCase <1) {
			throw new PassWordException("password must have at least a lowercase character");
		}
		int upperCase=0;
		for(int i=0;i<pw.length();i++) {
			if(pw.codePointAt(i) <=90 && pw.codePointAt(i)>=65) {
				upperCase++;
			}
		}
		if(upperCase <1) {
			throw new PassWordException("password must have at least a uppercase character");
		}
		if(!pw.matches("\\d+")) {
			throw new PassWordException("password must have at least a number");
		}
		//on the other side of the coin, you should use "non-char" regex that looks like this if special characters = allChars - number - ABC - space in your app context.
		if(!pw.matches("[^\\\\s\\\\w]*")) {
			throw new PassWordException("password must have at least a special character");
		}
		
		return true;
		
	}

}
