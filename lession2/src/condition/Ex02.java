package condition;

public class Ex02 {
	public static void main(String[] args) {
		int n = 5;
		// toán tử 3 ngôi
		if(n % 2 == 0) {
			System.out.println("n la so chan");
		}
		else {
			System.out.println("n la so le");
		}
		// expression ? statement1 : statement2
		String text = n % 2 == 0 ? "n la so chan" : "n la so le";
		System.out.println("text: " + text);
		float point = 8.2f;
		if(point < 5) {
			System.out.println("HS Yếu");
		}else if(point < 6.5f) {
			System.out.println("HS TB");
		}else if(point < 8) {
			System.out.println("HS Kha");
		}else {
			System.out.println("HS Gioi");
		}
	}
}
