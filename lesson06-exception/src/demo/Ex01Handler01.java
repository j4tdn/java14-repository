package demo;

import java.util.Scanner;

public class Ex01Handler01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number: ");

		int number = 0;
		do {
			try {
				number = Integer.parseInt(ip.nextLine());
				System.out.println("After entering ...");
				break;
			} catch (NumberFormatException nfe) {
				// 1. In ra thông tin lỗi, dòng lỗi
				// 2. Xử lý lỏi
				// System.out.printin("Hello - Something wrong with your code ...");
				// System.out.println("Log error -->
				nfe.printStackTrace();
				System.out.println("invlid, enter again: ");
			}
		} while (true);
		System.out.println("==============");
		System.out.println("value " + number);
		System.out.println("double value :" + Math.pow(number, 2));
	}
}
