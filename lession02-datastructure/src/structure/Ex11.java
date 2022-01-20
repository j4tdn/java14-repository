package structure;

import java.util.Arrays;

/**
 * Writing a Function to find the odd elements in array
 * 
 * @author Oanhpv1008
 *
 */
public class Ex11 {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 3, 29, 20 };

		System.out.println(Arrays.toString(oddElements(numbers)));

	}

	private static int[] oddElements(int[] elements) {
		int[] temp = new int[elements.length];
		int i = 0;
		for (int e : elements) {
			if (e % 2 != 0) {
				temp[i++] = e;
			}
		}
		return Arrays.copyOfRange(temp, 0, i );
	}
}
