package practice;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = ip.nextInt();
		String Notify = PowerOf(number) ? "Power Of 2 " : "Not Power Of 2";
		System.out.println(Notify);

	}

	private static boolean PowerOf(int n) {
		if (n == 0 || n == 2) {
			return true;
		}
		if (n == 1) {
			return false;
		}
		while (n > 2) {
			n = n / 2;
			if ((n % 2) != 0) {
				return false;
			}
		}
		return true;
	}

}
