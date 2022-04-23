package demo;

import java.util.Scanner;

/*
 * bài toán: lỗi chia số nguyên cho 0
 * ==> Xử dụng với throw, throws và try catch
 *
 */
public class Ex02Handler03ThrowThrows {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());
		System.out.println("Enter b: ");
		int b = Integer.parseInt(ip.nextLine());

		System.out.println("===========");
		// place 01: yêu cầu nhập vào a, b bất kỳ
		// divide(a, b) --> phải bắt lỗi

		// place 02: yêu cầu nhập vào a, b là các số nguyên dương
		// divide(a, b)
		int result = 0;
		try {
			result = divide(a, b);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Log error: " + e.getMessage());
		}
	}

	// Hàm --> có thể được gọi từ nhiều nơi
	// Mỗi hàm sẽ truyền giá trị của tham số khác nhau

	private static int divide(int a, int b) /*no need*/{
		// Thường mình sẽ sử dụng throw, throws với hàm có khả năng bị ngoại lệ
		// Vì hàm có khả năng = chưa chắc đã xảy ra ngoại lệ cho nên mình sẽ ko xử lý
		// ngoại lệ trong hàm này
		// Mà sẽ ném đi chỗ khác ( chỗ mà đang gọi nó)
		if (b == 0) {
			throw new ArithmeticException("Hello - It's me who throws the error"); // quăng lỗi ra để bắt ngoại lệ
			// thoát khỏi hàm
			// không thực thi code còn lại trong hàm
			// nếu như tại chỗ gọi hàm này có bắt lỗi thì sẽ lấy thông tin của lỗi này và in
			// ra
			// nếu không bắt lỗi thì chương trình sẽ dừng lại
		}
		return a / b;
	}
}
