package package01;

import java.util.Scanner;

public class FirstDegreeEquation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());

		System.out.print("Enter b: ");
		int b = Integer.parseInt(ip.nextLine());

		System.out.println("=========");

		int result = 0;
		try {
			result = divide(a, b);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Divided by zero operation cannot possible");
		}

	}

	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Hello - It's me who throws the error");
		}
		return -b / a;
	}
}
