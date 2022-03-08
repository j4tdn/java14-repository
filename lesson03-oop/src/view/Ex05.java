package view;

public class Ex05 {
	// static will init before non-static
	// k thể gọi 1 hàm non-static bên trong hàm static đc ( do non chưa đc khởi tạo nên k gọi đc)
	// ngược lại thì đc
	
	public static void main(String[] args) {

	}

	private static void show() {

	}

	private int sum(int a, int b) {
		return a + b;
	}
}
