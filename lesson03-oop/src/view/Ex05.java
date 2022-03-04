package view;

public class Ex05 {
	
	//static will construct before non-static.
	//không gọi non trong static.
	//gọi static trong non-static được .
	
	public static void main(String[] args) {
		show();
		//sum(1,2);
	}

	private static void show() {

	}

	private int sum(int a, int b) {
		show();
		return a + b;
	}
}
