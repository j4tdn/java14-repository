package format;

import java.text.DecimalFormat;

public class Ex01NumberFormat {
	
	//private static String PATTERN = "#,###.###";
	private static String PATTERN = "#,###.000";
	
	public static void main(String[] args) {
		double value = 4567.13;
		double total = getFactorialTotal();
		System.out.println("total: " + total);
		
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("format : " + df.format(total));
		System.out.println("value : " + df.format(value));
		
	}
	
	
	private static double getFactorialTotal() {
		double[] numbers = {4, 15, 5, 7};
		double total = 0;
		for(double number : numbers) {
			total+=factorial(number);
		}
		return total;
	}
	
	private static double factorial (double n) {
		double result = n ;
		while(n>1) {
			n--;
			result*=n;
		}
		return result;
	}
}
