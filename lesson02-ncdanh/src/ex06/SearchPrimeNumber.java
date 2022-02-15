package ex06;

import java.util.Scanner;

public class SearchPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Searching for the N-th prime number");
		System.out.println("Enter the value of N-th ===> N = ");
		Scanner input = new Scanner(System.in);
		int valueOfN = input.nextInt();
		int count = 0;
		long naturalNumber = 1;

		while (count != valueOfN) {
			naturalNumber++;
			if (isPrimeNumber(naturalNumber))
				count++;
		}
		System.out.println("The " + valueOfN + "-th prime number is: " + naturalNumber);
	}

	private static boolean isPrimeNumber(long number) {
		boolean check = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				check = false;
				break;
			}
			else check =true;
		}
		return check;
	}

}
