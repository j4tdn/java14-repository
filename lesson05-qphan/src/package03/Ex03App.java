package package03;

public class Ex03App {
	//
	// 2
	// 2 3
	// 2 3 4 5
	public static void main(String[] args) {
		System.out.println("lcm: " + lcm(new int[] { 2, 4, 5 }));
	}

	private static int lcm(int[] numbers) {
		int length = numbers.length;
		if (length == 0)
			return Integer.MIN_VALUE;
		if (length == 1)
			return numbers[0];

		int lcm = lcm(numbers[0], numbers[1]);
		for (int i = 2; i < numbers.length; i++) {
			lcm = lcm(lcm, numbers[i]);
		}
		return lcm;
	}

	// least common multiple
	private static int lcm(int a, int b) {
		return a * b / gcm(a, b);
	}

	// a6 b8
	// a6 b2
	// a4 b2
	// a2 b2
	// greatest common multiple
	private static int gcm(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	// 4 6
	// 4 = 2^2
	// 6 = 2 * 3
	// = 2^2 * 3 = 12

	// 12 15

	// 12 = 2^2 * 3
	// 15 = 3 * 5
	// = 2^2 * 3 * 5 ==> 60

	// UCLN: 2
	// (4*6)/2 = 12
}
