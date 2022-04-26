package Ex01;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Giải phương trình ax+b=0");
		System.out.println("Nhập a: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập b: ");
		int b = Integer.parseInt(sc.nextLine());
		float result = 0;
		try {
			result = solve(a, b);
		} catch (Exception e) {
			while (true) {
				System.out.println("a = 0, nhập lại a!=0");
				System.out.println("Nhập a : ");
				a = sc.nextInt();
				if (a != 0) {
					result = solve(a, b);
					break;
				}
			}
		}
		System.out.println("Nghiệm x= " + result);
	}

	private static float solve(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("a = 0, nhập lại a != 0");
		}
		return -b / a;
	}
}