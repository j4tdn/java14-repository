package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleType {
	public static void main(String[] args) {
		List<Integer> yearOfBirth = new ArrayList<Integer>();
		yearOfBirth.add(1999);
		yearOfBirth.add(1992);
		yearOfBirth.add(1988);

		// generic type --> catch error at compile time --> better 
		// yearOfBirth("epoch");
		
		for (Integer year : yearOfBirth) {
			System.out.println("Year of birth: " + year);
		}

	}
}
