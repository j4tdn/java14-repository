package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void printf(int[] elements) {
		for (int element: elements) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}
	
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
