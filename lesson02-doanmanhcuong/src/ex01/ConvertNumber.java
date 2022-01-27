package ex01;

public class ConvertNumber {
	public static final char CHAR_55 = 55;

	public static void main(String[] args) {
		int n = 17;
		System.out.println("Số " + n + " ở hệ cơ số 10 thành số ở hệ cơ số 2 là: " + ConvertNumber.convertNumber(n, 2));
	}

	public static String convertNumber(int n, int b) {
		if (n < 0 || b < 2) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int m;
		int remainder = n;
		while (remainder > 0) {
			if (b > 10) {
				m = remainder % b;
				if (m >= 10) {
					sb.append((char) (CHAR_55 + m));
				} else {
					sb.append(m);
				}
			} else {
				sb.append(remainder % b);
			}
			remainder = remainder / b;
		}
		return sb.reverse().toString();
	}
}
