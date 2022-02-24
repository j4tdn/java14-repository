package exercises;

import java.util.Scanner;

/**
 *
 * Enter valid number Enter number : abc Enter number : 123 Value : 123
 *
 * Enter valid number exceed three time
 *
 */

public class Ex01 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String text = null;
		int counter = 0;
		// validation

		// while
		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
			if (isValidNumber(text)) {
				break;
			}
			//counter++;
			if (++counter == 3) {
				System.out.println("Wrong text exceed three times");
				return;
			}
		} while (true);
		int number = Integer.parseInt(text);
		System.out.println("value : " + number);

	}

	//regular expression
	//regex pattern
	
	private static boolean isValidNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
//			if (input.charAt(i) < '0' || input.charAt(i) > '9')
			if(Character.isDigit(input.charAt(i)))	
			return false;
		}
		return true;
	}

}
