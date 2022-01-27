package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number you want to check :");
		int element = ip.nextInt();
		boolean check = symmetricalNumber(element);
		if (check == true) {
			System.out.println(element + " Is symmetry number");
		} else
			System.out.println(element + " Is not symmetry number");
	}

	private static int reverseNum(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}

	private static boolean symmetricalNumber(int n) {
		if (reverseNum(n) == n) {
			return true;
		}
		return false;
	}
}
