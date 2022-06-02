package manipulation;

import utils.ArrayUtils;

public class Ex04Reverse {
	public static void main(String[] args) {
		int[] elements = { 33, 18, 22, 44, 20 };
		reverse(elements);
		
		ArrayUtils.printf(elements);
		// 20 44 22 18 33
	}

	private static void reverse(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < length / 2; i++) {
			int tmp = elements[i];
			elements[i] = elements[length - i - 1];
			elements[length - i - 1] = tmp;
		}
	}
}
