package demo;

import java.util.Scanner;

/**
 * bài toán: nhập vào số nguyên --> chuỗi
 * => xử lý
 */
public class Ex01Handler01Validation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		
		String inputAsString = null;
		
		// validation
		
		// matches(regular-expression) ==> biểu thức chính quy giúp validate tính hợp lệ của một chuỗi string, thỏa mản yêu cầu nào đó ko?
        // \d --> số nguyên
		// + --> 1 hoặc n phần tử tương đương với {1}
		do {
			inputAsString = ip.nextLine();
			if(inputAsString.matches("\\d+")) {
				break;
			}
			System.out.println("Invalid number, enter again: ");
		}while(true);
		
		
		
		int number = Integer.parseInt(inputAsString);
	
		System.out.println("============");
		System.out.println("Value: " + number);
		System.out.println("Double Value: " + Math.pow(number, 2));
	}
}
