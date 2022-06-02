package declaration;

public class Ex01ArrayObjectType {
	public static void main(String[] args) {
		// JAVA types: class, enum, interface, abstract-class ==> object type
		// object type: extends Object -- int[] --> class [I extends Object

		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println("ToString: " + numbers.toString());
		System.out.println("Class: " + numbers.getClass().getName());

		System.out.println("=================");

		String[] sequences = {"a", "b", "c"};
		System.out.println("ToString: " + sequences.toString());
		System.out.println("Class: " + sequences.getClass().getName());
	}
}
