package practice;

public class SumOfFactorial {

	public static void main(String[] args) {
		System.out.println("Sum 4!+7!+12!+18! : " + (Factorial(4)+Factorial(7)+Factorial(12)+Factorial(18)));

	}

	private static long Factorial(int n) {
		long sum = n;
		for (int i = 1; i < n; i++) {
			sum = sum * i;
		}
		return sum;
	}

}
