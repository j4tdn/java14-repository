package exercises;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String text = null;
		int i = 0;
		do {
			if (i == 3) {
				System.exit(0);
			}
			System.out.print("Enter number: ");
			text = sc.nextLine();
			if (text.matches("[0-9]+")) {
				break;
			}
			if (++i == 3) {
				System.out.println("Wrong text exceed 3 times");
				System.exit(0);
			}
		} while (true);
		System.out.println(Integer.parseInt(text));
		System.out.println("Finished");
	}

	private static boolean isValidNumber(String input) {
		// charAt(i)=char a;
		for (int i = 0; i < input.length(); i++) {
//			if (input.charAt(i) == '0' || input.charAt(i) > '9')
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
