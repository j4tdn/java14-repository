package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Number of elements you want to import:");
		int elements = ip.nextInt();
		System.out.println("Enter a sequence of integers:");
		int[] array = new int[elements];
		for (int i = 0; i < elements; i++) {
			array[i] = ip.nextInt();
		}
		System.out.println("The largest odd number is:" + maxOddNumbers(array));
	}

	public static boolean isEven(int numbers) {
		if (numbers % 2 != 0) {
			return true;
		}
		return false;
	}

	public static int maxOddNumbers(int[] number) {
		int max = 0;
		for (int i = 0; i < number.length; i++) {
			if (isEven(number[i]) && number[i] > max) {
				max = number[i];
			}
		}
		return max;
	}

}
