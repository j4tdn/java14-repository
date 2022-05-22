package manipulation;

import java.util.Arrays;

import functional.Predicate;

import static utils.ArrayUtils.*;

/**
 * Viết chương trình tìm những ... trong mảng 
 * + Phần tử lẻ 
 * + Phần tử chẵn 
 * + Phần tử là số nguyên tố 
 * ......................... 
 * + Phần tử là bội của 5
 */
public class Ex01StrategyStep2 {
	public static void main(String[] args) {
		int[] digits = { 2, 5, 6, 11, 8, 10, 17, 19 };
		printf(digits);
		System.out.println("==================\n");

		Predicate oddStrategy = new Predicate() {
			@Override
			public boolean isValid(int input) {
				return input % 2 != 0;
			}
		};

		Predicate evenStrategy = new Predicate() {
			@Override
			public boolean isValid(int input) {
				return input % 2 == 0;
			}
		};

		// anonymous class
		Predicate primeStrategy = new Predicate() {
			private boolean isPrime(int number) {
				if (number == 0 || number == 1)
					return false;

				for (int i = 2; i <= Math.sqrt(number); i++) {
					if (number % i == 0) {
						return false;
					}
				}

				return true;
			}

			@Override
			public boolean isValid(int input) {
				return isPrime(input);
			}
		};

		int[] oddNbrs = getNumbers(digits, oddStrategy);
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
