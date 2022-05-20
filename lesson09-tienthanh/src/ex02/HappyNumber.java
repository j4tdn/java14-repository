package ex02;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 44;
		if (isHappy(n)) {
			System.out.println("Is Happy Number");

		} else {
			System.err.println("Isn't Happy Number");
		}
	}

	public static boolean isHappy(int n) {
		int slow = n;
		int fast = n;
		while (fast != 1 && sqr(fast) != 1) {
			slow = sqr(slow);
			fast = sqr(sqr(fast));
			if (fast == slow) {
				return false;
			}
		}
		return true;
	}

	public static int sqr(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + (rem * rem);
			n /= 10;
		}
		return sum;

	}
}