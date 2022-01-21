package structure;


public class Ex03 {
	public static void main(String[] args) {
		
		String text = "hello";
		String anotherText = new String("cheers");

		Integer number = 10;
		Integer anotherNumber = new Integer(100);
		
		System.out.println("text: " + text);
		System.out.println("another text: " + anotherText);

		Item itemA = new Item(101, 22, "IPhone X", 1500);

	
		System.out.println("--------------");
		System.out.println(itemA);

		Item itemB = new Item(102, 44, "SS S10+", 800);
		System.out.println(itemB.toString());
	}
}