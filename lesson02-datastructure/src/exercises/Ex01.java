package exercises;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		String text = null;
		int counter=0;
		
	//validation -->> 123 12a hello ==>> method isValid(number)
		
		do {
			System.out.println("Enter number :");
			text = ip.nextLine();
			if (isValidNumber(text)) {
				break;
			}
		//	counter++;
			if (++counter==3) {
				System.out.println("Wrong text exceed 3 times");
				System.exit(0);
			}
		}while(true);
		if (isValidNumber(text)) {
			int number = Integer.parseInt(text);
			System.out.println("value: " + number);
		}
	 System.out.println("==> Finished");
	}

	private static boolean isValidNumber(String input) {
		// hello --> intput.charAt(i)
		for (int i = 0; i < input.length(); i++) {
			
			//if (input.charAt(i) < '0' || input.charAt(i) > '9') {
			if(Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;

	}
}
