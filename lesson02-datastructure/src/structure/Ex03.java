package structure;

public class Ex03 {

//	format code ctrl + shift + f;
	
	public static void main(String[] args) {
		// Object type
		// Java object
		// 2 cách khởi tạo
		// cách 1
		String text = "Hello";
		Integer number = 10;
		// cách 2
		String anotherText = new String("Cheeres");
		Integer anotherNumber = new Integer(10);

		System.out.println("text : " + text);
		System.out.println("number : " + number);

		// Custom object type
		// B1: new Item(101, 22, "IPhone X", 1000): Tạo 1 đối tượng từ Item class
		Item itemA = new Item(101, 22, "IPhone X", 1000);

		// Mặc định: In 1 đối tượng
		// JAVA >>> tự động lấy đối tượng gọi hàm toString từ root JAVA class >> Object
		// Item extends Object:toString
		// Định nghĩa lại hàm toString trong class Item
		System.out.println("==============");
		System.out.println(itemA);
		// structure.Item@3d42158b
		// return this.getClass().getName() + '@' +
		// Integer.toHexString(this.hashCode());
		// System.out.println(itemA.toString());

		Item itemB = new Item(102, 44, "SS S10+", 800);
		System.out.println(itemB.toString());

	}

}
