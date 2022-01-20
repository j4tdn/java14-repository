package structure;

public class Ex02 {
	
	//global variable
	
	public static void main(String[] args) {
		//local variable 
		int age;
		age=22;
		float salary=100.56f;
		
		System.out.println("age value :" + age );
		System.out.println("salary value :" + salary );
		
		
		
		//object type: Java object type|| Custom Object type
		//Java object type: Integer, Sting, Double , Float
		// 2 way to construct
		//string text=null
		String text1 ="hello";
		String anthorText = new String("cheers");
		
		Integer number =10;
		Integer anthorNumber = new Integer(100);
		
		//ctrl alt down
		System.out.println("text"+ text1);
		System.out.println("another text"+ anthorText);
		
		//Custom object type: Employee, Item, Order
		//B1: new Item (!01,22,"Iphone",100):tao doi tuong
		Item itemA = new Item(101,22,"Iphone X",100);
		System.out.println("==========");
		itemA.show();
		System.out.println(itemA);
		//structure.Item@33c7e1bb
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(itemA.toString());
		Item itemB = new Item(102, 44, "SS S10+", 800);
		System.out.println(itemB.toString());
		
	}

}
