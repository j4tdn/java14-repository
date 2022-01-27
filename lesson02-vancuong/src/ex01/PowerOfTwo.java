package ex01;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		if (isPowerOfTwo(n) == true) {
			System.out.println("power of 2");
		} else {
			System.out.println("not power of  2");
		}
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 0 || n == 1) {
			return true;
		}
		int x = n / 2;
		int y = n % 2;
		if (y == 1) {
			return false;
		}
		return isPowerOfTwo(x);
	}

}
