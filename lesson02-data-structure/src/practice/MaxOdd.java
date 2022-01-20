package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOdd {

	public static void main(String[] args) {

		int number = Max_Number_Of_Array(Array_Of_Odd(InputArray()));

		System.out.println("Result: " + number);
	}

	// nhap so luong phan tu mang va gia tri tung phan tu
	private static int[] InputArray() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter element of array : ");
		int lengthArray = ip.nextInt();
		int[] arrayNumbers = new int[lengthArray];
		for (int i = 0; i < lengthArray; i++) {
			System.out.println("Enter element " + i);
			arrayNumbers[i] = ip.nextInt();
		}

		return arrayNumbers;

	}

	// tim cac phan tu le dua sang 1 mang khac
	private static int[] Array_Of_Odd(int[] elements) {
		int[] element = new int[elements.length];
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 != 0) {
				element[count] = elements[i];
				count++;
			}
		}
		return Arrays.copyOfRange(element, 0, count);
	}

	// tim phan tu lon nhat cua mang
	private static int Max_Number_Of_Array(int[] elements) {
		int max = Integer.MIN_VALUE;
		for (int element : elements) {
			if (max < element) {
				max = element;
			}
		}
		return max;
	}

	// In ra cac phan tu cua mang
	private static void Print_Array(int[] elements) {
		for (int element : elements) {
			System.out.println(element);
		}
	}

}
