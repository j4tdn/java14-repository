package manipulation;

import functional.Operator;

/**
 * Viết hàm, chương trình tìm ... 2 số
 * + Tổng
 * + Hiệu
 * + Tích
 * + Thương
 */
public class Ex02Practice {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println("SUM: " + calculate(x, y, (a, b) -> a + b));
		System.out.println("SUB: " + calculate(x, y, (a, b) -> a - b));
		System.out.println("MUL: " + calculate(x, y, (a, b) -> a * b));
	}
	
	private static int calculate(int a, int b, Operator operator) {
		return operator.execute(a, b);
	}
	
}
