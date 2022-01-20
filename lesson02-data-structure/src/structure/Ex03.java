package structure;

public class Ex03 {

	public static void main(String[] args) {
		String text = "hello"; // static type
		String anotherText = new String("cheers"); // dynamic type

		Integer number = 10;
		Integer anotherNumber = new Integer(100);//warning

		// ctrl alt down
		System.out.println("text: " + text);
		System.out.println("another text: " + anotherText);
		
		System.out.println("=============");
		
		Item itemA = new Item(101, 22, "Iphone X", 1000);
		System.out.println(itemA);
		System.out.println(itemA.toString());

	}

}
