package ex01;

public class Sum {
    public static void main(String[] args) {
    	long sum = 0;
		sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("Tổng của các giai thừa 4, 7, 12, 18: " + sum);
	}
    
    public static long factorial(int n) {
    	if (n == 0)
    		return 1;
    	long sum = 1;
    	for(int i = 1; i <= n; i++) {
    		sum *= i;
    	}
    	return sum;
    }
}
