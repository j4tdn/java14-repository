package view;

public class Ex03 {
	public static void main(String[] args) {
		//Ex03 ex03 = new Ex03();
		int sum = Ex03.sum(12, 14);
		System.out.println("sum : " + sum);
	}

	
	//>>static
	//Hàm này không phụ thuộc vào đối tương đang gọi
	//Mà phụ thuộc vào tham số truyền v
	private static int sum(int a, int b) {
		return a + b;
	}

}
