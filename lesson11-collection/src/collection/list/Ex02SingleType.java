package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleType {
	public static void main(String[] args) {
		List<Integer> yearOfBirths = new ArrayList<>();
		yearOfBirths.add(1999);
		yearOfBirths.add(1992);
		yearOfBirths.add(1988);
		
		// generic type --> catch error at compile time --> better
		// yearOfBirths.add("epoch");
		
		for (Integer year: yearOfBirths) {
			System.out.println("Year Of Birth: " + year);
		}
		
	}
}
