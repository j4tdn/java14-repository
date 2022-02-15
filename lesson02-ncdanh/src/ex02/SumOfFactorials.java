package ex02;

public class SumOfFactorials {

	public static void main(String[] args) {
		long sum;
		sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("4! + 7! + 12! + 18! = "+sum);
	}
	
	private static long factorial(int n) {
		long result =1;
		for(int i=1; i<=n; i++) {
			result*=i;
		}
		return result;
	}

}
