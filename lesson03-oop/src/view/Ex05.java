package view;

public class Ex05 {
	
	//static will construct before non-static

	public static void main(String[] args) {
		show();
		
		//a static method can not call a non-static method
		//sum(2,4);
	}

	private static void show() {

	}

	private int sum(int a, int b) {
		//a non-static method can call a static method
		show();
		return a + b;
	}

}
