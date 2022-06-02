package manipulation;

import static utils.ArrayUtils.*;

import java.util.Arrays;

/**
 * Viết chương trình tìm những .... trong mảng 
 * + Phần tử lẻ 
 * + Phần tử chẵn 
 * + Phần tử là snt 
 * + Phần tử là bội của 5
 */
public class Ex01StrategyStep1 {
	public static void main(String[] args) {
		int[] digits = { 2, 5, 6, 11, 8, 10, 17, 19 };
		printf(digits);
		System.out.println("=============\n");

		int[] oddNbrs = getOddNumbers(digits);
		printf(oddNbrs);

		int[] evenNbrs = getEvenNumbers(digits);
		printf(evenNbrs);
		
		int[] primeNbrs = getPrimeNumbers(digits);
		printf(primeNbrs);

	}

	private static int[] getOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] getEvenNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] getPrimeNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isPrime(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) return false;
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}

