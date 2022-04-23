package demo;

import java.util.Scanner;

/**
 * bài toán: nhập vào số nguyên --> chuỗi ==> sử dụng try catch
 * từ chỗ nào bị lỗi thì sẽ nhảy xuống catch ngay luôn
 */
public class Ex01Handler02TryCatch {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number = 0;
		do {
			try {
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
	            // 1. In ra thông tin lỗi, dòng lỗi
				// 2. Xử lý cái lỗi nớ
				//System.out.println("Hello - Something wrong with your code ...");
	            //System.out.println("Log error -->" + nfe.getMessage());
				nfe.printStackTrace();
				System.out.println("Invalid number, enter again: ");
			}

		} while(true);
		
		
		// Đặt đoạn code có khả năng xảy ra ngoại lệ trong khối try và khi nếu xảy ra
		// ngoại lệ thì
		// chương trình sẽ nhảy vào khối catch sau đó tiếp tục thực thi

		// Nếu đoạn code trong khối try không xảy ra ngoại lệ thì chương trình sẽ ko
		// nhảy vào khối catch và chương trình sẽ
		// thực hiện bình thường
		System.out.println("============");
		System.out.println("Value: " + number);
		System.out.println("Double Value: " + Math.pow(number, 2));
	}
}
