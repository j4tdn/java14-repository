package ex01;

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number :");
		int number = Integer.parseInt(input.nextLine());

		System.out.println(checkPower(number));

	}

	public static boolean checkPower(int number) {
		// 8
		if (number % 2 != 0) {
			return false;
		}
		else {
			while (number > 1) {
				// 8 
				if (number % 2 != 0) {
					return false;

				}
				number /= 2; 
			}
					}
		return true;

	}
}
