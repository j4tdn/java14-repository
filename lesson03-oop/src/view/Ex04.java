package view;

public class Ex04 {
	private int a;
	private int b;
	
	public Ex04(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		Ex04 ex04 =  new Ex04(2,3);
		int rs=ex04.sum();
		System.out.println("Sum "+rs);
	}
	private  int sum () {
		return a + b;
	}
}
