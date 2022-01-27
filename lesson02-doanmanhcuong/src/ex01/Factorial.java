package ex01;

public class Factorial {
	public static void main(String[] args) {
		long S = 0;
		S = tinhGiaiThua(4) + tinhGiaiThua(7) + tinhGiaiThua(12) + tinhGiaiThua(18);
		System.out.println("Tổng của các giai thừa 4,7,12,18 là: " + S);
	}

	public static long tinhGiaiThua(int n) {
		long gt = 1;
		for (int i = 1; i <= n; i++) {
			gt *= i;
		}
		return gt;
	}
}
