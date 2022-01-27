package ex02;

public class Sum {
	public static long Factorial(int n) {
		if (n == 0 || n==1) {
			return 1;
		}	
        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }
	public static void main(String[] args) {
		long sum = 0; 
		sum = Factorial(4) + Factorial(7) + Factorial(12) + Factorial(18);
        System.out.println("SUM: " + sum);
	}
}
