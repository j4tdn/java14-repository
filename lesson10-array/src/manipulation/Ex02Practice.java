package manipulation;

import java.util.function.BiFunction;

import funtional.Operator;

/**
 * Viet ham tinh .... 2 so
 * 
 *
 */
public class Ex02Practice {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		int sum = calculate(x, y, (a, b) -> a + b);
		int sub = calculate(x, y, (a, b) -> a - b);
		int mul = calculate(x, y, (a, b) -> a * b);
		System.out.println("sum " + sum);
		System.out.println("sub " + sub);
		System.out.println("mul " + mul);
	}

//	private static int calculate(int a, int b, Operator operator) {
//		return operator.execute(a, b);
//	}

	private static int calculate(Integer a,Integer b,BiFunction<Integer,Integer,Integer> biFunc) {
		return biFunc.apply(a,b);
	}
	
	
	
	
}
