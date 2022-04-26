package baitap1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Equation {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Giải phương trình ax+b = 0");
		System.out.print("nhập a,b: ");
		int a = 0;
		int b = 0;
		float result = 0;
		do {
			try {
				a = Integer.parseInt(input.nextLine());
				b = Integer.parseInt(input.nextLine());
				result = solve(a,b);
				break;
			} catch(NumberFormatException  nfe) {
				System.out.println(nfe.getMessage());
				System.out.println("nhập sai dữ liệu mời nhập lại !");
			}
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} while(true);
		
		System.out.println("kết quả x = "+result);
		
	}
	
	private static float solve(int a,int b) {
		if(a==0) {
			throw new ArithmeticException("Lỗi chia 0, mời nhập lại");
		}
		return -(float)b/a;
	}
}
