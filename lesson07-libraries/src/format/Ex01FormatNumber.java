package format;

import java.text.DecimalFormat;

public class Ex01FormatNumber {
	// private static String PATTERN = "#,###.###";
	private static String PATTERN = "#,###.00";

	public static void main(String[] args) {
		double value = 2312321421.4213132;
		double total = getFtotal();
		System.out.println("total: " + total);

		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("format: " + df.format(total));
		System.out.println("value: " + df.format(value));

	}

	private static double getFtotal() {
		double[] numbers = { 4, 8, 12 };
		double total = 0;
		for (double number : numbers) {
			total += factorial(number);

		}
		return total;
	}

	private static double factorial(double n) {
		double result = n;
		while (n > 1) {
			n--;
			result *= n;
		}
		return result;
	}
}
