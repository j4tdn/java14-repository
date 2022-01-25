package ex06;

public class Prime200 {
	public static void main(String[] args) {
		int dem = 1;
		int k;
		for (int i = 2;; i++) {
			if (checkNum(i)) {
				dem++;
			}
			if (dem == 200) {
				k = i;
				break;
			}
		}
		System.out.println(k);
	}
	public static boolean checkNum(int a) {
		for (int i = 2; i < Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
