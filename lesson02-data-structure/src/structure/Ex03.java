package structure;
/*format code: ctrl shift f
 * Object type 
 * +JAVA avariable object
 * +Manually created 
*/
public class Ex03 {
	public static void main(String[] args) {
		// Object Type : Java object types || Custom Object types
		// Java Object type: Integer, String,Double,Float...
		// 2 ways to construct
		String text = "hello"; // static type
		String anotherText = new String("cheers");// dynamic type

		Integer number = 10;
		Integer anotherNumber = new Integer(100);
		// warning in Integer contructor method
		// @Deprecated: signature, un-encourage using (not good), able to use
		// ctrl alt down
		System.out.println("text: " + text);
		System.out.println("another text: " + anotherText);

		// Custom Object types: Employee, Item, Oder

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
