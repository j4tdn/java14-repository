package manipullation;

import static utils.ArrayUtils.prinf;

import java.util.Arrays;

import functional.Strategy;

public class Ex02StrategyStep2 {
	public static void main(String[] args) {
		int[] digits = {2,5,6,11,8,10,17,19};
		prinf(digits);
		System.out.println("=================");
		
		Strategy oddStrategy = new Strategy() {
			@Override
			public boolean test(int input) {
				return input % 2 != 0;
			}
		};
		Strategy evenStrategy = new Strategy() {
			@Override
			public boolean test(int input) {
				return input % 2 == 0;
			}
		};
		Strategy primeStrategy = new Strategy() {
			private boolean isPrime(int number) {
				if(number == 0 || number ==1) {
					return false;
				}
				for(int i=2;i < Math.sqrt(number); i++) {
					if(number % i == 0){
						return false;
					}
				}
				return true;
			}
			@Override
			public boolean test(int input) {
				return input % 2 == 0;
			}
		};
		int[] oddNbrs = getNumbers(digits, oddStrategy);
		int[] evenNbrs = getNumbers(digits, evenStrategy);
		int[] primeNbrs = getNumbers(digits, primeStrategy);
		
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
