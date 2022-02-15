package ex04;

import java.util.Scanner;

public class FindMaxOddNumber {

	public static void main(String[] args) {
		System.out.println("Enter the length of your array of integers: ");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int max = 0;
		int a[] = new int[length];
		System.out.println("Entry your array of intergers");
		for (int i = 0; i < length; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = input.nextInt();
		}

		for (int i = 0; i < length; i++) {
			if (a[i] % 2 != 0 && max <= a[i])
				max = a[i];
		}

		System.out.println("The maximum value in the array of integers is: " + max);

	}

}
