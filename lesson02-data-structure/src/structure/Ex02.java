package structure;

public class Ex02 {

	// global variable - attribute

	public static void main(String[] args) {
		// local variable
		// Primitive type
		int age = 22;
		int year = 2000;

		char letter = 'T';
		float salesPrice = 199.999f;

		System.out.println("age value: " + age);
		System.out.println("slaes price: " + salesPrice);

		// Object type: Java object types || Custom Object types
		// Java object types: Integer, String, Double, Float ...
		// Custom object types: Employee, Item, ...

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
