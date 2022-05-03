package ex03;

import java.util.Scanner;

public class CheckEmail {
	public static void main(String[] args) {
		 boolean flag;
	        Scanner sc = new Scanner(System.in);
	        do {
	            String emailPattern = "\\w+@\\w+[.]\\w+";
	            System.out.print("Input your email(email@address.com): ");
	            String input = sc.next();
	            flag = input.matches(emailPattern);
	            if (!flag) System.out.println("Invalid data!");
	        } while (!flag);
	        System.out.println("Valid data");
	        
	        // code này em tham khảo trên mạng 
	}
	
	public static boolean checkEmail(String email)
	{
		
		if (email.length() < 8 || email.length() > 100) {
			throw new NumberFormatException("Invalid email, at least 8 charactor and at most 100 charactor");
		}
		
		return true;
	}
}
