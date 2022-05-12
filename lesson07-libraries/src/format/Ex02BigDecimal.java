package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigDecimal {
	public static void main(String[] args) {
		//BigDecimal, BigInteger
		// calculation method >> add , subtract, multiply, divide
		// rounding >> setScale, roundMode
		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		BigDecimal e = BigDecimal.valueOf(123.456);
		BigDecimal f = BigDecimal.valueOf(567.567);
		
		BigDecimal add = a.add(b);
		BigDecimal sub = c.subtract(b);
		BigDecimal mul = f.multiply(e);
		BigDecimal divide = e.divide(c);
		
		System.out.println("add " + add);
		System.out.println("sub " + sub);
		System.out.println("mul " + mul);
		System.out.println("divide " + divide);
		
		mul = mul.setScale(2, RoundingMode.HALF_UP);
		System.out.println(mul);
		
		
		
		
	}
}
