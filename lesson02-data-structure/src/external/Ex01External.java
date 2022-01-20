package external;
import structure.Ex01TestMainMethod;
import structure.Item;
public class Ex01External {
	public static void main(String[] args) {
		// explain access modifier - public, private
		// public:  using in it's own class and everywhere
		// private: using in it's own class - internal
					
		// static: Method is static 
		// that can call directly via it's own ClassName
		Ex01TestMainMethod.anotherMain();
		// Ex01TestMainMethod.otherMethod();
		// Temporary: public | private static
	}
}
/*Custom object types: Employee, Item, Order
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
}*/
