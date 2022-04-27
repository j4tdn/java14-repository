package ex01;

import java.util.Scanner;

/*
 * Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. Sử dụng try -
catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. Bẫy lỗi chia 0,
trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra
kết qua x = -b/a
 */
public class SolveFirstDegreeEquation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int a,b;
		do {
			System.out.println("Enter number a = ");
			String string1 = ip.next();
			System.out.println("Enter number b = ");
			String string2 = ip.next();
			if (string1.matches("\\d+") && string2.matches("\\d+")) {
                 a = Integer.parseInt(string1);
                 b = Integer.parseInt(string2);
                 break;
			}
		    System.out.println("Request to re-enter the value as a number");

		} while (true);
		double result = 0.0f;
		try {
			result = handle(a, b);
		} catch (Exception e) {
			while(true) {
				System.out.println("The value of a is equal to 0, please re-enter a = ");
				System.out.println("a = ");
				a = ip.nextInt();
				System.out.println("re-enter b = ");
				b = ip.nextInt();
				if(a!=0) {
					result = handle(a, b);
					break;
							
				}
			}
		}
		System.out.println("Result: " + result);

	}

	private static double handle(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("The value of a is equal to 0");
		}
		return -b / a;
	}
}
