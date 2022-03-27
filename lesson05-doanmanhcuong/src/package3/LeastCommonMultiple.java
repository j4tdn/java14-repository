package package3;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		int[] elements = { 2, 3, 4 };
		System.out.println("BCNN = " + getLeastCommonMultiple(elements));
	}

	public static int getLeastCommonMultiple(int[] elements) {
		int getLeastCommonMultiple = 1;
		int divisor = 2;
		while (true) {
			int counter = 0;
			boolean divisible = false;
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == 0) {
					return 0;
				} else if (elements[i] < 0) {
					elements[i] = elements[i] * (-1);
				}
				if (elements[i] == 1) {
					counter++;
				}
				if (elements[i] % divisor == 0) {
					divisible = true;
					elements[i] = elements[i] / divisor;
				}
			}
			if (divisible) {
				getLeastCommonMultiple = getLeastCommonMultiple * divisor;
			} else {
				divisor++;
			}
			if (counter == elements.length) {
				return getLeastCommonMultiple;
			}
		}
	}
}
