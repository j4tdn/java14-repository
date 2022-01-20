package structure;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		int[] numbers = { 1, 4, 3, 29, 20 };
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}

	// Tao ham can xac dinh:
	// 1. KDL tra ve
	// 2. Tham so truyen vao
	// 3. Access modifier

	private static int[] findOddNumbers(int[] elements) {
		int[] result = new int[elements.length];
		int run = 0;

		for (int element : elements) {
			if (element % 2 != 0) {
				result[run] = element;
				run++;
			}
		}

		return Arrays.copyOfRange(result, 0, run);

		//int[] finalResult = new int[run];
		//for (int i = 0; i < run; i++) {
			//finalResult[i] = result[i];
		//}

		//return finalResult;
	}

}
