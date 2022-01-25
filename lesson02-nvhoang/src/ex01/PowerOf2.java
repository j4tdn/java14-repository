package ex01;

import java.util.Scanner;

public class PowerOf2 {
	public class B1 {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int number;
			System.out.print("Nhập số cần kiểm tra: ");
			number = sc.nextInt();
			for (int i = 0; i < number; i++) {
				if (number == Math.pow(2, i)) {
					System.out.println(number + " là lũy thừa của 2");

				}

			}

		}
	}
}
