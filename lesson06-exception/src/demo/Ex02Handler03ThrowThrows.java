package demo;

import java.util.Scanner;

//bai toan : phep chia so nguyen cho 0

public class Ex02Handler03ThrowThrows {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a : ");
		int a = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter b : ");
		int b = Integer.parseInt(ip.nextLine());
		
		
		
		// place 01 --> yêu cầu nhập vào a và b bất kỳ
		// divide(a,b) 
		
		
		
		// place 02 --> yêu cầu  nhập vào a và b là số nguyên dương
		// divide(a,b)
		int result = 0;
		try {
			result = divide(a, b);
		} catch(ArithmeticException e) {
			System.out.println("Log error: " + e.getMessage());
		}
		
		System.out.println("Result: " + result);
	}
	
	private static int divide(int a, int b) {
		/*
		 * thường mình sẽ sử dụng throw, throws với hàm có khả năng bị ngoại lệ
		 * vì hàm có khả năng = chưa chắc đã xảy ra ngoại lệ cho nên mình sẽ không xử lý
		 * ngoại lệ trực tiêps trong hàm này
		 * mà sẽ ném đi chỗ khác(chỗ nào mà đang gọi nó)
		 */
		if(b==0) {
			throw new ArithmeticException("Hello - It's me who throws the error");
			// không thực thi code còn lại trong hàm
			// nếu như tại chỗ gọi hàm này có bắt lỗi thì sẽ lấy thông tin của lỗi này và in ra
			// nếu không bắt lỗi thì chương trình sẽ dừng lại
		}
		return a/b;
	}
}
