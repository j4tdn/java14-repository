package view;

public class Ex03 {
	public static void main(String[] args) {
		// Ex03 ex03 = new Ex03();
		int sum = Ex03.sum(12, 14);
		System.out.println("Sum: " + sum);
	}
	
	// non-static >>> đối tượng
	// Hàm này ko phụ thuộc vào đối tượng đang gọi
	// Mà phụ thuộc vào tham số truyền vào
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// >> non-static, 'static'
}
