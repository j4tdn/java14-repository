package ex02;

public class Sum {
	public static void main(String[] args) {
		System.out.println("Tổng các giai thừa: " + (factorial(18) + factorial(4) + factorial(7) + factorial(12)));
	}
	public static long factorial(int n) {
		long number = n;
		for (int i = 1; i < n; i++) {
			number = number * i;
		}
		return number;
	}
}
