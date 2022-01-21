package structure;

import java.util.Arrays;


public class Ex11 {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 3, 29, 20 };
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	private static int[] findOddNumbers(int[] elements) {
		int[] result = new int[elements.length];
		int run = 0;
		
		for (int element: elements) {
			if (element % 2 != 0) {
				result[run++] = element;
			}
		}
		
		return Arrays.copyOfRange(result, 0, run);
		
	}
}