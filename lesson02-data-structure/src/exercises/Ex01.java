package exercises;

import java.util.Scanner;

/**
 * Enter and validate a valid number ? 
 * E.g: 
 * + Enter number: abc 
 * + Enter number: 123 
 * Value: 123 
 * --------------------------------------------------------- 
 * Exit system if wrong number count exceed 3 times
 */
public class Ex01 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String text = null;
		int counter = 0;
		// validation -->> 123 12a hello ==>> method isValid(number)
		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
			if (isValidNumber(text)) {
				break;
			}
			if (++counter == 3) {
				System.out.println("Wrong text exceed 3 times");
				System.exit(0);
			}
		} while (true);

		int number = Integer.parseInt(text);
		System.out.println("value: " + number);

		System.out.println("==> Finished");
	}
	
	private static boolean isValidNumber(String input) {
		// hello --> input.charAt(i)
		for (int i = 0; i < input.length(); i++) {
			// input.charAt(i) < '0' || input.charAt(i) > '9'
			if (Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}