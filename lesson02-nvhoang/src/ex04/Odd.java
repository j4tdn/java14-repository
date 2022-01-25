package ex04;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ" + i);
			arr[i] = sc.nextInt();
		}
		System.out.print("Các phần tử của mảng: " + " ");
		show(arr);
		////
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] > max) && (arr[i] % 2 == 1)) {
				max = arr[i];
			}

		}
		System.out.println("Số lẻ lớn nhất: " + max);
	}

	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
