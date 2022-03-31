package package01;

/**
 * Bài 1 (15đ): Viết hàm kiểm tra một số có phải là lũy thừa của một số khác
 * không
 *
 */
public class Ex01App {
	public static void main(String[] args) {
		double a = 2;
		double b = 4;
		System.out.println("a:" + a);
		System.out.println("b:" + b);

		// validation --> manual handling

		boolean isPower = a > b ? isPowerOf(a, b) : isPowerOf(b, a);
		System.out.println("isPower: " + isPower);
	}
	
	private static boolean isPowerOf(double greater, double smaller) {
		if (greater == smaller || smaller == 1) return true;
		if (smaller == 0) return false;
		if (greater < 1 && smaller < 1) {
			double tmp = greater;
			greater = 1.0 / smaller;
			smaller = 1.0 / tmp;
		}
			
		greater = greater / smaller; // 4
		double mod = greater % smaller; // 0
		while(greater != 1) {
			if (mod != 0) return false;
			mod = greater % smaller; // 0 0 0
			greater = greater / smaller; // 2 1 0..5
		}
		return true;
	}
}
