package view;

public class Ex03 {

	public static void main(String[] args) {
		int sum = Ex03.sum(12, 24);
		System.out.println(sum);
	}
	
	//non-static >>> doi tuong
	//ham nay khong phu thuoc vao doi tuong dang goi
	//ma phu thuoc vao tham so truyen vao
	private static int sum(int a, int b) {
		return a + b;
	}
}
