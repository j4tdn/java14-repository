package package01;

import java.util.Scanner;

public class IsPowerOf {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter the first number that is not equal to 0: ");
			a = input.nextInt();
		} while (a == 0);

		do {
			System.out.println("Enter the second number that is not equal to 0: ");
			b = input.nextInt();
		} while (b == 0);
		
		boolean isPowerof = isPowerOf(a, b);
		if (isPowerof) {
			System.out.println("True!");
		}
		if (!isPowerof) {
			System.out.println("False!");
		}
	}

	private static boolean isPowerOf(int a, int b) {
		int tempNumber1 = a > b ? a : b;
		int tempNumber2 = a > b ? b : a;
		boolean checkValue = true;
		if (tempNumber1 != 1 && tempNumber2 != 1) {
			int x = tempNumber1 / tempNumber2;
			int y = tempNumber1 % tempNumber2;
			while (x > 0) {
				if (y != 0) {
					checkValue = false;
					break;
				}
				y = x % tempNumber2;
				x = x / tempNumber2;
			}
			return checkValue;
		} else {
			return checkValue;
		}
	}
}
