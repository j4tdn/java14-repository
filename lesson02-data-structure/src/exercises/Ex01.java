package exercises;

import java.util.Scanner;

public class Ex01 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		String text = null;
		int count = 0;

		// validation
		// while(condition) || while(true)

		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
			
			if(isValidNumber(text)) {
				break;
			}
			
			count++;
			
			if(count ==3) {
				System.out.println("Entry times exceed 3");
				System.exit(0);
			}
		} while (true);

		if (isValidNumber(text)) {
			int number = Integer.parseInt(text);
			System.out.println("value: " + number);
		}

	}

	private static boolean isValidNumber(String input) {
		// hello ---> input.charAt(i)
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

}
