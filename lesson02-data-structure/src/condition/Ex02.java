package condition;

public class Ex02 {
	public static void main(String[] args) {
		// toán tử 3 ngôi
		int n = 10;
		String text = n % 2 == 0 ? " n la chan" : "n la le";
		System.out.println(" text : " + text);

		float point = 7.2f;
		if (point < 5) {
			System.out.println("HS Yếu");
		} else if (5 < point && point < 7) {
			System.out.println("HS TB");
		} else if (7 < point && point < 8) {
			System.out.println("HS Khá");
		} else {
			System.out.println("HS G");
		}

	}
}
