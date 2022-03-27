package encapsulation.internal;

public class OriginalSon extends Father{
	
	public static void main(String[] args) {
		OriginalSon originalSon = new OriginalSon();
		System.out.println("ADN: " + originalSon.adn());
		System.out.println("Account: " + originalSon.account());
	}
}