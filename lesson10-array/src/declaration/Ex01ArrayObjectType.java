package declaration;

public class Ex01ArrayObjectType {
	public static void main(String[] args) {
		// Java types: class,enum,interface,abstract-class ==> object type
		// object type: extends Object -- int[] --> class [I extend Object]
		int[] numbers = {1,2,3,4,5};
		
		System.out.println("ToString: " +  numbers.toString());
		System.out.println("Class: " +  numbers.getClass().getName());
		
		String[] sequence = {"a","b","c"};
		System.out.println("ToString: " +  sequence.toString());
		System.out.println("Class: " +  sequence.getClass().getName());
		
		
	}
}
