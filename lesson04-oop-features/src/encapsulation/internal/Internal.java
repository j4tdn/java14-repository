package encapsulation.internal;

public class Internal {
	public static void main(String[] args) {
		Father father = new Father();
		// Gọi sử dụng --> '', protected chỉ được phép gọi bên trong phạm vi package
//		System.out.println("adn: " + father.adn());
//		System.out.println("account: " + father.account());
		
	}
}
