package package01;

public class Ex01AppThanh {
	public static void main(String[] args) {
		System.out.println(isPowerOf(125, 5));
		System.out.println(isPowerOf(64, 4));
		System.out.println(isPowerOf(105, 10));
	}

	public static boolean isPowerOf(int a, int b) {
		// stop condition
		if (a == 1 || b == 1 || a == b) return true;
		if (a == 0 || b == 0 || (a % b) != 0) return false;
		
		return isPowerOf(a / b, b);
	}
}
