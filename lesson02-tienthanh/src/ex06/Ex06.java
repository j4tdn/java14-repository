package ex06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		long i = 1;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the location you want to find:");
		int numbers = ip.nextInt();
		int count = 0;
		while (count != numbers) {
			i++;
			if (isPrime(i)) {
				count++;
			}
		}
		System.out.println("The " + numbers + " prime number is : " + i);

	}

	public static boolean isPrime(long n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
