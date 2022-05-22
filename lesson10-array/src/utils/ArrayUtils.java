package utils;

public class ArrayUtils {
	public ArrayUtils() {
		
	}
	public static void prinf(int[] element) {
		for(int elements : element) {
			System.out.print(elements + " ");
		}
		System.out.println();
	}
	public static boolean isPrime(int number) {
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
}
