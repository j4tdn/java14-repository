package structure;

public class EX03 {
	public static void name(String[] args) {
		String text1 = "hello";
		String anthorText = new String("cheers");

		Integer number = 10;
		Integer anthorNumber = new Integer(100);

		// ctrl alt down
		System.out.println("text" + text1);
		System.out.println("another text" + anthorText);

		// Custom object type: Employee, Item, Order
		// B1: new Item (!01,22,"Iphone",100):tao doi tuong
		Item itemA = new Item(101, 22, "Iphone X", 100);
		System.out.println("==========");
		itemA.show();
		System.out.println(itemA);
		// structure.Item@33c7e1bb
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(itemA.toString());
		Item itemB = new Item(102, 44, "SS S10+", 800);
		System.out.println(itemB.toString());
	}
}
