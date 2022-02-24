package exeroses;
import java.util.Scanner;
public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		String text = null;
		int count = 0;
		// validation -->> 123 12a hello ==>> method isValid(number)
		do{
			System.out.println("Enter number : ");
			text = ip.nextLine();
			if(isValidNumber(text)) {
				break;
			}
			if(++count == 3) {
				System.out.println("Wrong text exceed 3 times");
//				System.exit(0);
				return;
			}
		}while(true);
		int number = Integer.parseInt(text);
		System.out.println("value: " + number);
		System.out.println("==> Finished");
	}
	//regular expression
	//regex pattern
	private static boolean isValidNumber(String input) {
		//hello --> input.charAt();
		//input.charAt(i) < '0' || input.charAt(i) > '9'
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;	
	}
}
