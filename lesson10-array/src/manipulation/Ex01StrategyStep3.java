package manipulation;

import java.util.Arrays;

import functional.Predicate;
import utils.ArrayUtils;

import static utils.ArrayUtils.*;

/**
 * Viết chương trình tìm những ... trong mảng + Phần tử lẻ + Phần tử chẵn + Phần
 * tử là số nguyên tố ......................... + Phần tử là bội của 5
 */
public class Ex01StrategyStep3 {
	public static void main(String[] args) {
		int[] digits = { 2, 5, 6, 11, 8, 10, 17, 19 };
		printf(digits);
		System.out.println("==================\n");

		// Predicate oddStrategy = number -> number % 2 != 0;
		Predicate evenStrategy = input -> input % 2 == 0;
		Predicate primeStrategy = input -> ArrayUtils.isPrime(input);

		int[] oddNbrs = getNumbers(digits, number -> number % 2 != 0);
		int[] evenNbrs = getNumbers(digits, evenStrategy);
		int[] primeNbrs = getNumbers(digits, primeStrategy);

		printf(oddNbrs);
		printf(evenNbrs);
		printf(primeNbrs);

	}

	// condition --> input: int --> output: boolean
	// Strategy strategy = oddStrategy;
	private static int[] getNumbers(int[] numbers, Predicate strategy) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (strategy.isValid(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}