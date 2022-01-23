package ex02;

public class SumOfFactorial {

	public static void main(String[] args) {
		System.out.println("4! + 7! + 12! + 18! = " + (factorial(4) + factorial(7) + factorial(12) + factorial(18)));

	}

	// tinh giai thua cua so n
	private static long factorial(int n) {
		long sum = n;
		for (int i = 1; i < n; i++) {
			sum = sum * i;
		}
		return sum;
	}

}
