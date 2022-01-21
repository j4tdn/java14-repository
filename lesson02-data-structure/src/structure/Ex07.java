package structure;


public class Ex07 {
	public static void main(String[] args) {
		int tmp = 99;
		final int number = 20;
	
		System.out.println("number: " + number);
		
		System.out.println("----------------");
		final Integer digit = 20;
		System.out.println("digit: " + digit);
		
		System.out.println("----------------");
		final Item itemA = new Item(1, 1, "Device X", 50);
		itemA.price = 99;
		System.out.println("itemA: " + itemA);
		

		final Item itemX = new Item(1, 1, "Device X", 11); // H2
		final Item itemY = new Item(2, 2, "Device Y", 22); // H2
		itemX.storeId = 10;
		itemX.itemId = 20;
		

		
	}
}