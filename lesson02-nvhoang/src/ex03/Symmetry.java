package ex03;

import java.util.Scanner;

public class Symmetry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Số cần kiểm tra: ");
		int num, r, sum = 0, a;
		num = sc.nextInt();
		a = num;
		while (num != 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (a == sum) {
			System.out.println(a + " Là số đối xứng");
		} else {
			System.out.println(a + " Không phải là số đối xứng");
		}
	}
}
