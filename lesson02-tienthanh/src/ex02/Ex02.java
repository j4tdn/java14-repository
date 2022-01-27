package ex02;

import java.util.Scanner;

public class Ex02 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = { 4, 7, 12, 18 };
		System.out.println("Sum of elements factorial is :" + sumOfEachElementFactorial(array));
	}

	public static long sumOfEachElementFactorial(int[] arr) {
		long sum = 0;
		for (int i : arr) {
			sum += factorial(i);
		}
		return sum;
	}

	public static long factorial(int element) {
		long value = 1;
		for (int i = 1; i <= element; i++) {
			value *= i;
		}
		return value;
	}
}