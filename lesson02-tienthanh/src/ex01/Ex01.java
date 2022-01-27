package ex01;

import java.util.Scanner;

/**
 * Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 
 * Ý tưởng của e trong bài toán sẽ là duyệt từ đầu tới phần tử N
 * Nhận thấy số sau sẽ bắng số trước nhâ với 2 (power=power*2)
 * Điều kiện dừng sẽ là bằng số nhập để kiểm tra 
 * @author ADMIN
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number is needed check : ");
		int number = Integer.parseInt(ip.nextLine());
		isPow2(number);
	}
	private static void isPow2(int number) {
		int power=1;
		while(power*2<=number) {
			power=power*2;
		}
		if(power==number) {
			System.out.println( power+ "Is a power of 2");
		}
		else
		{
			System.out.println( power+ "Is not a power of 2");
		}
	}
}
