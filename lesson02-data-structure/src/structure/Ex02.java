package structure;

public class Ex02 {
    
	// global variable - attribute
	
	public static void main(String[] args) {
		
		// local variable
		int age = 22;
		int year = 2000;
		
		char letter = 'T';
		float salesPrice = 199.999f;
		float salary = 1000.56f;
		
		String text = "hello";
		String anotherText = new String("cheers");
		
		Integer number = 10;
		//Interger anotherNumber = new Integer(100);
		
		// ctrl alt down
		System.out.println("text: " + text);
		System.out.println("another text: " + anotherText);
		
		// custom object 
		// Custom object types: Employee, Item, Order
				// B1: new Item(101, 22, "IPhone X", 1000): Tạo 1 đối tượng từ Item class
				Item itemA = new Item(101, 22, "IPhone X", 1000);
				
				// Mặc định: In 1 đối tượng
				// JAVA >>> tự động lấy đối tượng gọi hàm toString từ root JAVA class >> Object
				// Item extends Object:toString
				// Định nghĩa lại hàm toString trong class Item
				System.out.println("==============");
				System.out.println(itemA);
		// structure.Item@3d42158b
				// return this.getClass().getName() + '@' + Integer.toHexString(this.hashCode());
				// System.out.println(itemA.toString());
				
				Item itemB = new Item(102, 44, "SS S10+", 800);
				System.out.println(itemB.toString());
		
	}
}
