package generic;

import generic.type.CustomList;
import generic.type.IList;

public class Ex03GenericClassWithCustomList {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();
		System.out.println("size: " + numbers.size());
		
		numbers.add(51);
		numbers.add(52);
		numbers.add(53);
		numbers.add(54);
		
		System.out.println("size: " + numbers.size());
		
		// forEach --> array, instance of Iterable<E>
		numbers.show();
		
		System.out.println("At 2: " + numbers.get(2));
		
		System.out.println("amount of even numbers: " + numbers.count(number -> number %2 == 0));
	}
}
