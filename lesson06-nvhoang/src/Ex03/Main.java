package Ex03;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	EmailCheck emailCheck = new EmailCheck();
	System.out.println("Nhập email: ");
	String str = sc.nextLine();
	
	try {
		emailCheck.checkEmail(str);
	}catch (EmailException ex) {
		System.out.println("Lỗi: " + ex.getMessage());
	}
	sc.close();
}
}
