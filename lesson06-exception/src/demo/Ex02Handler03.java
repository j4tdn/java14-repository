package demo;

import java.util.Scanner;

/**
 * Phép toán chia nguyên cho 0
 * xử lý throw, throws
 * @author Oanhpv1008
 *
 */
public class Ex02Handler03 {
	private static Scanner ip= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter a: ");
		int a= Integer.parseInt(ip.nextLine());
		System.out.print("enter b: ");
		int b= Integer.parseInt(ip.nextLine());
		int rs=0;
		try {
			rs= devide(a, b);
		} catch (ArithmeticException e) {
			System.out.println("Log error: "+e.getMessage());
		}
		System.out.println("Rs: "+rs);
		
		//place01: require enter a and b bk
		// must catch error here
		
		// place 02 -> nguyên dương
	}

	private static int devide(int a, int b) {
		// use "throw or throws" with function will be Exception
		// not handle Exception direction but throw it other place
		if(b==0) {
			throw new ArithmeticException("Hello - It's me who throws the error");
			// thoát khỏi hàm
		}
		return a / b;
	}
}
