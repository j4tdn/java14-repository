package package01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RepairEx01 {
	public static void main(String[] args) {
		double a = 125;
		double b = 5;
		boolean isPower = a > b ? isPowerOf(a, b) : isPowerOf(b, a);
		System.out.println(isPower);
		System.out.println("=========\nlog");
		
		System.out.println(isPowerOfy(a, b));
	}

	private static boolean isPowerOf(double greater, double smaller) {
		if (greater == smaller || smaller == 1)
			return true;
		if (smaller == 0)
			return false;
		if (greater < 1 && greater < 1) {
			double temp = greater;
			greater = 1.0 / smaller;
			smaller = 1.0 / temp;
		}
		greater = greater / smaller;
		double mod = greater % smaller;
		while (greater != 1) {
			if (mod != 0)
				return false;
			mod = greater % smaller;
			greater = greater / smaller;
		}
		return true;
	}

	// recursion
	public static boolean isPowerOfx(int a, int b) {
		if (a == 1 || b == 1 || a == b)
			return true;
		if (a == 0 || b == 0 || (a % b) != 0)
			return false;
		return isPowerOf(a / b, b);
	}
	
	public static boolean isPowerOfy(double a,double b) {
		double rs= Math.log(a)/Math.log(b);
		rs=BigDecimal.valueOf(rs).setScale(10,RoundingMode.HALF_UP).doubleValue();
		return Math.floor(rs)==Math.ceil(rs);
	}
}
