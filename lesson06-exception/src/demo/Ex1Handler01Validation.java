package demo;

import java.util.Scanner;

public class Ex1Handler01Validation {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		
		String inputAsString = null;
		
		//validation
		//maches(rerular-expresstion)
		// ==> biểu thức chính quy giúp mình kiểm tra tính hợp lệ của 1 chuỗi
		// String, thoả mãn yêu cầu gì đó không?
		//\d --> số nguyên
		// + --> 1 hoặc n phần tử tương đương với {1}
		do {
			inputAsString = ip.nextLine();
			if(inputAsString.matches("\\d+")){
				break;
			}
			System.out.println("Invalid number, enter again: ");
		}while(true);
		
		int number = Integer.parseInt(inputAsString);
		
		System.out.println("======================");
		
		System.out.println("Value" + number);
		System.out.println("Double Value : " + Math.pow(number, 2));
	}
}
