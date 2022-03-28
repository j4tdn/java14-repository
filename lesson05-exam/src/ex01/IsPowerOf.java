package ex01;

public class IsPowerOf {
	public static boolean isPowerOf(int a, int b) {
		while(a > 0) {
			if(a == 1) return true;
			if(a < b) return false;
			if(a % b != 0) {
				return false;
			}
			a /= b;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 4));
		System.out.println(isPowerOf(7, 2));
		System.out.println(isPowerOf(1, 3));
		System.out.println(isPowerOf(20, 2));
		System.out.println(isPowerOf(64, 2));
	}

}
