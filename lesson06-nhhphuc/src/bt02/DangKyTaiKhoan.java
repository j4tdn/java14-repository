package bt02;

import java.util.Scanner;


public class DangKyTaiKhoan {
	public static void main(String[] args) {
		System.out.println("Enter your password....: ");
		Scanner sc = new Scanner(System.in);
		
		do {
			String string = sc.nextLine();
			try {
				checkCharacterCount(string);
				checkHasNumber(string);
				checkHasSpecial(string);
				checkHasUpperLower(string);
				
				break;
			} catch (CharacterCountException e) {
				System.out.println("Your password must have more than 8 characters and less than 256 characters");
				System.out.println("Please re-enter your password");
			} catch (HasSpecialException e) {
				System.out.println("Your password must have at least 1 special character");
				System.out.println("Please re-enter your password");
			} catch (HasNumberException e) {
				System.out.println("Your password must have at least 1 number character");
				System.out.println("Please re-enter your password");
			} catch (UpperLowerException e2) {			
				System.out.println("Your password must have at least 1 upper character and at least 1 lower character");
				System.out.println("Please re-enter your password");
			}			
		} while (true);
		  
    }
	
	private static boolean checkCharacterCount(String chuoi) throws CharacterCountException {
		int count = 0;
        for(int i = 0; i < chuoi.length(); i++) {    
            if(chuoi.charAt(i) != ' ')    
                count++;    
        }    
        if(count>=8 && count<=256) {
        	System.out.println("Total number of characters in a string: " + count); 
        }
        else {
        	throw new CharacterCountException("Your password must have more than 8 characters and less than 256 characters");
        }
		return true; 	
	}
	
	private static boolean checkHasSpecial(String chuoi) throws HasSpecialException{
		if(chuoi.matches("[a-zA-Z0-9 ]*")) {
			throw new HasSpecialException("Your password must have at least 1 special character");
		}
		return true;
	}
	
	private static boolean checkHasNumber(String chuoi) throws HasNumberException{
		if(!chuoi.matches(".*[0-9].*")) {
			throw new HasNumberException("Your password must have at least 1 number character");
		}
		return true;
	}
	
	private static boolean checkHasUpperLower(String chuoi) throws UpperLowerException{
		boolean hasUppercase = !chuoi.equals(chuoi.toLowerCase());
		boolean hasLowercase = !chuoi.equals(chuoi.toUpperCase());
		
		if(!hasUppercase || !hasLowercase) {
			throw new UpperLowerException("Your password must have at least 1 upper character and at least 1 lower character");
		}
		return true;
	}

}
