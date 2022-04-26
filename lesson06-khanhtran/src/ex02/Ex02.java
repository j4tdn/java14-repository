package ex02;

import java.util.Scanner;

public class Ex02 {
	
	private static Scanner ip = new Scanner(System.in);
	
    public static void main(String[] args) {
		String x = createPassword();
		System.out.println(x);
	}
    
    public static String createPassword() {
    	String result = null;
    	System.out.println("Create a new password");
    	do {
    		System.out.print("Password: ");
    		result = ip.next();
    		try {
    			if(legalLowerCase(result) && legalUpperCase(result) && legalDigit(result) && legalLengthPassword(result) && legalSpecialCharacter(result)) {
    				break;
    			}
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Create password again!");
			}
		} while (true);
		return result;
    }
    
    public static boolean legalLengthPassword(String ip) {
    	if(!(ip.length() >= 8 && ip.length() <= 256)) throw new NumberFormatException("Password need at least 8 characters and at most 256 characters");
    	return true;
    }

    public static boolean legalLowerCase(String ip) {
    	if(!ip.matches(".*[a-z].*")) throw new NumberFormatException("Password need at least 1 lower case");
    	return true;
    }
    public static boolean legalUpperCase(String ip) {
    	if(!ip.matches(".*[A-Z].*")) throw new NumberFormatException("Password need at least 1 upper case");
    	return true;
    }
    public static boolean legalDigit(String ip) {
    	if(!ip.matches(".*[0-9].*")) throw new NumberFormatException("Password need at least 1 digit");
    	return true;
    }
    public static boolean legalSpecialCharacter(String ip) {
    	if(!ip.matches(".*[^\\w].*")) throw new NumberFormatException("Password need at least 1 special character");
    	return true;
    }
}
