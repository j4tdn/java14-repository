package demo;

import java.util.Scanner;
/**
 * Nhập số nguyên có chuỗi
 * =>. xử ý
 * @author Oanhpv1008
 *
 */
public class Ex01Validation {
	private static Scanner ip= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		String input=ip.nextLine();
		while(true) {
			if(input.matches("[0-9]+")) { // \\s:space  \\d :digit =[0-9]
				break;
			}
			System.out.print("Invalid number ,enter again: ");
			input=ip.nextLine();
		}
		int number= Integer.parseInt(input);
		
		System.out.println("value "+ number);
		System.out.println("double value :"+Math.pow(number, 2));
	}
}	
