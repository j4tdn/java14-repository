package package01;

import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01LogApp {
	public static void main(String[] args) {
		System.out.println("isPower: " + isPowerOf(5, 25));
	}
	
	public static boolean isPowerOf(double a, double b) {
		// 80/20
		double log = a > b ? log(a) / log(b) : log(b) / log(a);
		log = BigDecimal.valueOf(log)
				.setScale(10, RoundingMode.HALF_UP)
				.doubleValue();
		return ceil(log) == floor(log);
	}
}
