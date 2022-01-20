package practice;

import java.util.Scanner;

public class StringCheck {
	static int count = 0;

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Enter Number String: ");
			String strNumber = ip.nextLine();
			int checkLengthStringNumber = (strNumber.length() > 3) ? 1 : 0;
			if (checkLengthStringNumber == 1) {
				System.out.println("Permit Length Number String is Three Character");
				continue;
			}
			count = NumberString(strNumber) ? ++count : count;
		} while (count < 3);
		System.out.println("Over three time input number string");
	}

	private static boolean NumberString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return true;
			}
		}
		return false;

	}

}
