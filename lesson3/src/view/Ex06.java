package view;

import java.util.Arrays;

/*
 * 1. find odd, prime numbers from input number list
 */
public class Ex06 {
	public static void main(String[] args) {
		
	}
	
	private static int[] findPrimeNbers(int[] input) {
		int[] result = new int[input.length];
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			// is prime number
			if (isPrimeNumber(input[i])) {
				result[count++] = input[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static int[] findOddNbers(int[] input) {
		int[] result = new int[input.length];
		int count = 0;

		for (int i = 0; i < input.length; i++) {
			if (isOddNuber(input[i])) {
				result[count++] = input[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean isOddNuber(int number) {
		return number % 2 != 0;
	}
	private static boolean isPrimeNumber(int n)
	{
	    if (n < 2)
	        return false;
	    for (int i = 2; i <= Math.sqrt(n); i++)
	    {
	        if (n % i == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
}
