package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleType {
	public static void main(String[] args) {
		
		// jdk 1.5, 1.6: List<Integer> yearOfBirths = new ArrayList<Integer>();
		// jdk 1.7: List<Integer> yearOfBirths = new ArrayList<>();
		List<Integer> yearOfBirths = new ArrayList<Integer>();
		yearOfBirths.add(1992);
		// từ jdk 1.5 thì java tự convert int và Integer qua lại với nhau
		
		// đưa lên heap : boxing
		// về lại stack : unboxing
		yearOfBirths.add(1999);
		yearOfBirths.add(1991);
		yearOfBirths.add(1993);
		// generic type --> catch error at compile time --> better
		//yearOfBirths.add("epoch");
		for( Integer year: yearOfBirths) {
			System.out.println("Year Of Birth: " + year);
		}
	}
}
