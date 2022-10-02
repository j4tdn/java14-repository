package generic;

import generic.type.CustomList;
import generic.type.IList;

public class Ex03GenericClassWithCustomList {
	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();
		System.out.println("size: " + numbers.size());

		numbers.add(05);
		numbers.add(15);
		numbers.add(25);
		numbers.add(35);
		numbers.add(45);
		numbers.add(55);
		numbers.add(65);
		numbers.add(75);
		numbers.add(85);
		numbers.add(95);
		
		System.out.println("size: " + numbers.size());
		

	}
}
