package view;

public class Ex04 {

	private int a;
	private int b;

	public Ex04(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Ex04 e1 = new Ex04(2, 4);
		System.out.println(e1.sum());
	}

	// non-static >>> doi tuong
	// ham nay khong phu thuoc vao doi tuong dang goi
	// ma phu thuoc vao tham so truyen vao
	private int sum() {
		return a + b;
	}
	
}
