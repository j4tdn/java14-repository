package ex04;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOdd {

	public static void main(String[] args) {
		
		int[] arrayNumber =  inputArray();
		
		int [] arrayOdd = arrayOfOdd(arrayNumber);
		
		int number = maxNumberOfArray(arrayOdd);

		System.out.println("Result: " + number);
	}

	// nhap so luong phan tu mang va gia tri tung phan tu
	private static int[] inputArray() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter element of array : ");
		int lengthArray = ip.nextInt();
		int[] arrayNumbers = new int[lengthArray];
		for (int i = 0; i < lengthArray; i++) {
			System.out.print("Enter element " + i);
			arrayNumbers[i] = ip.nextInt();
		}

		return arrayNumbers;

	}

	// tim cac phan tu le dua sang 1 mang khac
	private static int[] arrayOfOdd(int[] elements) {
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
	private static int maxNumberOfArray(int[] elements) {
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
