package ex01;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = ip.nextInt();
		String Notify = powerOf(number) ? "Power Of 2 " : "Not Power Of 2";
		System.out.println(Notify);

	}

	//kiem tra xem so n co phai luy thua cua 2 hay khong
	private static boolean powerOf(int n) {
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
