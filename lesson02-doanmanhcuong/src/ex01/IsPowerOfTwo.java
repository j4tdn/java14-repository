package ex01;

import java.util.Scanner;

public class IsPowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số kiểm tra là 8: " + IsPowerOfTwo.isPowerOfTwo(8));
		System.out.println("Nhập số kiểm tra là 10: " + IsPowerOfTwo.isPowerOfTwo(10));

	}

	public static boolean isPowerOfTwo(int n) {
		if (0 == n || 1 == n)
			return true;
		int x = n / 2;
		int y = n % 2;
		if (1 == y)
			return false;
		return isPowerOfTwo(x);
	}
}
