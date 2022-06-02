package manipulation;

import utils.ArrayUtils;

public class Ex03Crud {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 46, 12, 33 };

		try {
			int[] addElements = add(elements, 18, 5);
			ArrayUtils.printf(addElements);
			
			int[] insertedElements = insert(elements, 18, 5);
			ArrayUtils.printf(insertedElements);

			int[] removeElements = remove(insertedElements, 2);
			ArrayUtils.printf(removeElements);

		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

	}

	private static int[] remove(int[] source, int k) {
		if (k < 0 || k > source.length) {
			throw new IllegalArgumentException("Inserted position must in[" + 0 + "," + source.length + "]");
		}
		int[] target = new int[source.length - 1];
		// B1: copy elements from i = 0 to less than k
		for (int i = 0; i < k; i++) {
			target[i] = source[i];
		}
		for (int i = k; i < target.length; i++) {
			target[i] = source[i + 1];
		}
		return target;

	}

	private static int[] insert(int[] source, int newValue, int k) {
		if (k < 0 || k >= source.length) {
			throw new IllegalArgumentException("Inserted position must in[" + 0 + "," + source.length+ "]");
		}
		int[] target = new int[source.length + 1];

		for (int i = 0; i < target.length; i++) {
			if (i < k) {
				target[i] = source[i];

			} else if (i == k) {
				target[i] = newValue;

			} else {
				target[i] = source[i - 1];
			}
		}
		target[k] = newValue;
		return target;
	}

	// ONE LOOP
	private static int[] add(int[] source, int newValue, int k) {
		if (k < 0 || k > source.length) {
			throw new IllegalArgumentException("Inserted position must in[" + 0 + "," + source.length+ "]");
		}
		int[] target = new int[source.length + 1];

		// B1: copy all elements from preArray to new Array
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}

		// B2: shift right ONE UNIT from k to source.length-1
		for (int i = target.length - 1; i > k; i--) {
			target[i] = target[i - 1];
		}
		target[k] = newValue;
		return target;
	}
}
