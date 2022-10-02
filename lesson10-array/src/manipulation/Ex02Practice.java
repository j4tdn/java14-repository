package manipulation; // thao tác

import functional.Operator;

public class Ex02Practice {

	/**
	 * Viết hàm, chương trình tìm ... của 2 số 
	 * + Tổng 
	 * + Hiệu 
	 * + Tích 
	 * + Thương
	 */
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 15;
		
		System.out.println("SUM: " + calculate(number1, number2, (a,b) -> a + b));
		System.out.println("SUB: " + calculate(number1, number2, (a,b) -> a - b));
		System.out.println("MUL: " + calculate(number1, number2, (a,b) -> a * b));
		
	}
	private static int calculate(int number1, int number2, Operator operator) {
		return operator.execute(number1, number2);
	}
}
