package manipullation;

import static utils.ArrayUtils.prinf;

import java.util.Arrays;

import functional.Strategy;
import utils.ArrayUtils;

public class Ex02StrategyStep3 {
	public static void main(String[] args) {
		int[] digits = {2,5,6,11,8,10,17,19};
		prinf(digits);
		System.out.println("=================");
		
//		Strategy oddStrategy = input -> input % 2 != 0;
//		Strategy evenStrategy = input -> input % 2 == 0;
//		Strategy primeStrategy = input -> ArrayUtils.isPrime(input);
	
		int[] oddNbrs = getNumbers(digits, input -> input % 2 != 0);
		int[] evenNbrs = getNumbers(digits, input -> input % 2 == 0);
		int[] primeNbrs = getNumbers(digits, input -> ArrayUtils.isPrime(input));
		
		prinf(oddNbrs);
		prinf(evenNbrs);
		prinf(primeNbrs);
	}
	
	private static int[] getNumbers(int[] numbers, Strategy strategy) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(strategy.test(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
