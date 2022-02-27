package view;

public class Ex05 {
	
	// static will construct before non-static
	public static void main(String[] args) {
		show();
		// ko thể gọi hàm non-static ben trong hàm static 
		//sum(1,2);
	}
	private static void show() {
		
	}
	private int sum(int a, int b) {
		show();
		return a+b;
	}
}
