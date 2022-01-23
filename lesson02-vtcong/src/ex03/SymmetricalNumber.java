package ex03;

import java.util.Scanner;

public class SymmetricalNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number : ");
		int numberIp = ip.nextInt();
		String result = symmetricalNumber(numberIp) ? " Symmetrical Number" : " Not Symmetrical Number";
		System.out.println(numberIp + result);

	}

	// kiem tra 1 so co phai so doi xung hay khong
	private static boolean symmetricalNumber(int n) {
		int numberstart = n;
		int number = 0;
		while (n != 0) {
			number = number * 10 + (n % 10);
			n = n / 10;
		}
		if (number == numberstart) {
			return true;
		} else
			return false;
	}
}
