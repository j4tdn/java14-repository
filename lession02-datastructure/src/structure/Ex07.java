package structure;
/**
 * final
 * -> modifiable
 * >> Primitive Value Stack
 * -> can not assign value
 *>> Object
 *
 *->>>>> final : active at Stack, can not assign Value of variable at Stack
 *	/// can not reassign use operator "=" when var at stack
 * ->>>>but can update value at HEAP except default type in JAVA
 */
public class Ex07 {
	public static void main(String[] args) {
		final int number=20;
//		number=40; //error
		
		 final Item itemA= new Item();
		 itemA.price=999;
	}
}
