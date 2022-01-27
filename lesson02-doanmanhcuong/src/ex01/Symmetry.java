package ex01;

import java.util.Scanner;

public class Symmetry {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int reversed = 0;
		int original;
		System.out.println("Nhập số để kiểm tra: ");
		num = scanner.nextInt();
		original = num;
		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		if (reversed == original) {
			System.out.println(original + " là số đối xứng!");
		} else {
			System.out.println(original + " không phải là số đối xứng!");
		}
	}
}
