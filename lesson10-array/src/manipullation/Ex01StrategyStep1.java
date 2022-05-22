package manipullation;
import static utils.ArrayUtils.*;
import java.util.Arrays;

/**
 * Viet chương trình tìm những ... trong mảng
 * + phần tử lẻ
 * + phần tử chẵn
 * + phần tử là số nguyên tố
 * + phần tử là bội của 5
 */
public class Ex01StrategyStep1 {
	public static void main(String[] args) {
		int[] digits = {2,5,6,11,8,10,17,19};
		prinf(digits);
		System.out.println("==============");
		int[] oddNbs = getOddNumbers(digits);
		prinf(oddNbs);
		int[] evenNbs = getEvenNumbers(digits);
		prinf(evenNbs);
		int[] primeNbs = getPrimeNumbers(digits);
		prinf(primeNbs);
	}
	
	private static int[] getOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(number % 2 != 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static int[] getEvenNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(number % 2 == 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static int[] getPrimeNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int number : numbers) {
			if(isPrime(number)) {
				result[count++] = number;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean isPrime(int number) {
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
