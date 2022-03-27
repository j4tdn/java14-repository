package package1;

public class IsPowerOf {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}

	public static boolean isPowerOf(int a, int b) {
		if (a == 1)
			return (b == 1);
		int pow = 1;
		while (pow < b)
			pow = pow * a;
		return (pow == b);
	}
}
