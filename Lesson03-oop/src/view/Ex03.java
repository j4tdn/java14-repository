package view;

public class Ex03 {
	public static void main(String[] args) {
		
		Ex03 ex3 = new Ex03();
		
		System.out.println("sum"+ ex3.sum(12, 14));
	}
	
	// hàm này không phụ thuộc vào đối tượng đang gọi
	// mà phụ thuộc vào tham số truyền vào
	private static int sum (int a , int b)
	{
		return a + b;
	}

}
