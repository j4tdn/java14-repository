package exercises_chapter1;

import java.util.Scanner;

public class Ex1_checkIsPower {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number is needed checking: ");
		double ip = sc.nextDouble();
		System.out.println(checkIsPower1(ip));
	}

	public static boolean checkIsPower(double ip) {
		for (int i = Integer.MIN_VALUE; i < ip; i++) {
			if (Math.pow(2, i) == ip) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkIsPower1(double ip) {
		double s = Math.log(ip) / Math.log(2);
		return Math.floor(s)==Math.ceil(s);
	}
}
