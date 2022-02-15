package ex03;

import java.util.Scanner;

public class IsSymmetricNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for checking: ");
		int number = input.nextInt();
		boolean isSymmetric = isSymmetricNumber(number);

		if (isSymmetric) {
			System.out.println(number + " is a symmetric number");
		}
		if (!isSymmetric) {
			System.out.println(number + " is not a symmetric number");
		}
	}

	private static boolean isSymmetricNumber(int checkNumber) {
		int sum = 0;
		int n = checkNumber;
		while (n != 0) {
			int x = n % 10;
			n = n / 10;
			sum = sum * 10 + x;
		}
		return sum == checkNumber;

	}

}
