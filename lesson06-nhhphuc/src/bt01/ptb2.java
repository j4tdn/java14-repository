package bt01;

import java.util.Scanner;

public class ptb2 {
	public static void main(String[] args) {
		System.out.println("ax + b = 0");
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("a = ");
			String a =(sc.nextLine());
			System.out.print("b = ");
			String b = (sc.nextLine());
				try {
					double result = ptb2(a, b);
					System.out.println("result: "+result);
					break;
				} catch (ArithmeticException e) {
					System.out.println("a must be different from 0. Please re-enter");
				} catch (NumberFormatException e) {
					System.out.println("a and b must be number. Please re-enter");
				}
				
		} while (true);
	}

	private static double ptb2(String a, String b) {
		Double an = Double.parseDouble(a);
		Double bn = Double.parseDouble(b);
		if(an==0) {
			throw new ArithmeticException();
		}
		if(a.matches("\\d+.\\d+") || b.matches("\\d+.\\d+")) {
			throw new NumberFormatException();
		}
		return -bn/an;
	}
}
