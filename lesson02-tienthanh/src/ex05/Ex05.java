package ex05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the decimal to be converted:");
		int numbers = ip.nextInt();
		System.out.println("The binary of the given number is:");
		decToBinary(numbers);
		
	}

	private static void decToBinary(int n) {
		int i=0;
		int[] result = new int[1000];
		for (i = 0; n > 0; i++) {
			result[i] = n % 2;
			n /= 2;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.println(result[j]);
		}
	}
}
