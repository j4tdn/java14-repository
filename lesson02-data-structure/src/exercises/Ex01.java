package exercises;

import java.util.Scanner;

public class Ex01 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String text = ip.nextLine();
		int count = 0;
		do {
			System.out.print("Enter the number ");
			text = ip.nextLine();
			if(!isValidNumber(text))
			{
				break;
			}
			if(++count == 3)
			{
				System.exit(0);
			}
		}
		while(true);

	}

	public static boolean isValidNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
//			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
			if(Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
