package structure;

public class Ex03 {
	public static void main(String[] args) {
		String text = "hello";
		String anotherText = new String("cheer");

		Integer number = 10;

		// @Deprecated: signature, un-encourage using(not good), able to use
		System.out.println("text: " + text);

		Item itemA = new Item(102, 22, "IphoneX", 2);
		System.out.println(itemA);

		// custom object types: Employee, Item. Order
		Item itemB = new Item(102, 22, "ss s10", 23);
		itemB.show();

	}
}
