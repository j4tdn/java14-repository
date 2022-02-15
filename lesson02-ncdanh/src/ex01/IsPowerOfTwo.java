package ex01;

import java.util.Scanner;

public class IsPowerOfTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for checking: ");
		int i = input.nextInt();

		boolean isPowerOf2 = isPowerOf2(i);
		if (isPowerOf2) {
			System.out.println("Then " + i + " is the power of 2");
		}
		if (!isPowerOf2) {
			System.out.println("Then " + i + " is not the power of 2");
		}
	}
	
	private static boolean isPowerOf2(int number) {
		if (0 == number || 1 == number)
			return true;
		int x = number / 2;
		int y = number % 2;
		if (1 == y)
			return false;
		return isPowerOf2(x);
	}

}
