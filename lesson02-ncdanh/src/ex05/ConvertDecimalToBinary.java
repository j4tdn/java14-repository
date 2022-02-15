package ex05;

import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a natural number to convert!");
		Scanner input = new Scanner(System.in);
		int decNumber = input.nextInt();
		System.out.print("Natural number " + decNumber + " have its binary form of: ");
		convertDecToBinary(decNumber);
	}

	public static void convertDecToBinary(int number) {
		int n = number;
		int digitNumber = 0;
		if (n == 0)
			digitNumber = 1;
		while (n != 0) {
			n = n / 2;
			digitNumber++;
		}
		int[] arr = new int[digitNumber];
		for (int i = 0; i < digitNumber; i++) {
			arr[i] = number % 2;
			number = number / 2;
		}
		for (int j = digitNumber - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
	}
}
