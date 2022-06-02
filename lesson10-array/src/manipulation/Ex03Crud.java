package manipulation;

public class Ex03Crud {
	public static void main(String[] args) {
		int[] elements = { 1, 9, 5, 36, 12, 33 };
		try {
			int[] insertElements = add(elements, 18, 0);
			int[] removeElements = remove(elements, 0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

	private static int[] add(int[] source, int newValue, int k) {
		if (k < 0 || k > source.length) {
			throw new IllegalArgumentException("array of bound exception");
		}

		int[] target = new int[source.length + 1];

		// b1: Coppy all elements from preArray to newArray
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}

		// b2 : Shift right ONE UNIT from k to source.length-1
		for (int i = target.length - 1; i > k; i--) {
			target[i] = target[i - 1];
		}

		target[k] = newValue;

		return target;
	}

	private static int[] remove(int[] source, int k) {
		if (k < 0 || k >= source.length) {
			throw new IllegalArgumentException("array of bound exception");
		}

		int[] target = new int[source.length - 1];

		// B1 Coppy elements from i=0 to less than k
		for (int i = 0; i < k; i++) {
			target[i] = source[i];
		}
		
		for(int i = k ; i < target.length ;i++) {
			target[i] = source[i+1];
		}

		return target;

	}
	
}
