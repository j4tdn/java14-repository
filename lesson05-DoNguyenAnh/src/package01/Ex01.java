package package01;

import java.util.Scanner;

public class Ex01 {
	public static boolean checkExponential(int firstNumber, int secondNumber) {
		for (int i = 1; i < Math.sqrt(firstNumber); i++) {
			if (Math.pow(secondNumber, i) == firstNumber)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first number:");
		firstNumber = scanner.nextInt();
		System.out.println("Enter your second number:");
		secondNumber = scanner.nextInt();
		if (firstNumber > secondNumber) {
			if (checkExponential(firstNumber, secondNumber)) {
				System.out.println("(" + firstNumber + "," + secondNumber + ")true");
			} else {
				System.out.println("(" + firstNumber + "," + secondNumber + ")false");
			}

		} else {
			if (checkExponential(secondNumber, firstNumber)) {
				System.out.println("(" + firstNumber + "," + secondNumber + ")true");
			} else {
				System.out.println("(" + firstNumber + "," + secondNumber + ")false");
			}
		}

	}
}
