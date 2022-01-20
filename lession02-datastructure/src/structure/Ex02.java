package structure;

public class Ex02 {
	// global variable-attribute
	public static void main(String[] args) {
		// local variable
		// primitive type
		int age = 22; // declare and initial
		int year = 2000;

		char letter = 'T';
		float salesPrice = 199.22f;

		float salary = 1000.21f;

		System.out.println("age : " + age);
		// object type
		// 2 way to construct
		
		String text = "hello";
		String anotherText = new String("cheer");
		
		Integer number=10;

		// @Deprecated: signature, un-encourage using(not good), able to use
		System.out.println("text: "+text);

		Item itemA= new Item(102,22,"IphoneX",2);
		System.out.println(itemA);
		
		// custom object types: Employee, Item. Order
		Item itemB= new Item(102, 22, "ss s10", 23);
		itemB.show();

	}
}
