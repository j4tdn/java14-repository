package demo;

import java.util.Scanner;

/*
 * bài toán nhập vào số nguyên ---> chuỗi
 * ==> sử dụng try cath
 */

public class Ex01Handler02TryCatch {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number = 0;
		do {
			try {
				number = Integer.parseInt(ip.nextLine());
				System.out.println("After entering ...");
				break;
			}catch(NumberFormatException nfe) {
				// 1. In ra thông tin lỗi,dòng lỗi
				// 2. Xử lí cái lỗi	
				//System.out.println("Something wrong with your code ...");
				//System.out.println("Log error --> " + nfe.getMessage());
				nfe.printStackTrace();
				System.out.println("Invalid number , enter again: ");
			}
		}while(true);
		
		
		// đặt đoạn code có khả năng xảy ra ngoại lệ trong khối try, và khi nêu
		// xảy ra ngoại lệ thì chương trình nhảy vào catch sau đó tiếp tục thực thi
		
		// nếu đoạn code trong khối try không xảy ra ngoại lệ thì chương trình không nhảy
		// vào khối catch mà thực thi như bình thường
		
		System.out.println("=========");
		System.out.println("Value: " + number);
		System.out.println("Double Value : " + Math.pow(number, 2));
	}
}
