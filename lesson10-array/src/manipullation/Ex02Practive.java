package manipullation;
import functional.*;
/**
 * Viết chương trình tìm ... 2 số
 * + tổng
 * + hiểu
 * + tích
 * + thương
 */
public class Ex02Practive {

	public static void main(String[] args) {
		int x =10;
		int y =10;
		
		System.out.println("SUM : " + calculate(x, y, (a, b) -> a + b));
		System.out.println("SUM : " + calculate(x, y, (a, b) -> a - b));
		System.out.println("SUM : " + calculate(x, y, (a, b) -> a * b));
		System.out.println("SUM : " + calculate(x, y, (a, b) -> a / b));
	}
	private static int calculate(int a, int b,Operator operator) {
		return operator.execute(a,b);
	}
}
