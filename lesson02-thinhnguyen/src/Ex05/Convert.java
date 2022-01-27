package Ex05;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cần chuyển đổi : ");
		n = sc.nextInt();
		System.out.print("Hệ nhị phân của " + n +" là :");
		System.out.print(Integer.toBinaryString(n));
	}
	
}
