package ex01;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		int oddNumber = 0;
		int[] numberArr = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int max = numberArr[0];
		for (int i = 0; i < numberArr.length; i++) {
			if (numberArr[i] % 2 == 1 && numberArr[i] > max) {
				max = numberArr[i];
			}
		}
		System.out.println("Số lẻ lớn nhất trong mảng là: " + max);

	}
}
