package condition;

public class Ex02 {
public static void main(String[] args) {
	// Toán tử 3 ngôi
	int n=5;
	if (n%2 == 0) {
		System.out.println("n là số chẵn");
		
	}else {
		System.out.println("n là số lẻ");
	}
	// expression ? statement 1: statement 2
	String text = n % 2 ==0 ? "n là số chẵn" : "n là số lẻ";
	System.out.println("Text: " +text);
	
	int point =8 ;
	if (point <5) {
		System.out.println("HS yếu");
	}else if (point <6.5f) {
		System.out.println("HS TB");
	}else if (point <8.0f) {
		System.out.println("HS Khá");
	}else {
		System.out.println("HS Giỏi");
	}
}
}
