package view.stream.practice;

import java.util.Arrays;
import java.util.OptionalInt;

// allMatch
// anyMatch
// noneMatch
// findFirst
// findAny
public class Ex03FindingAndMatching {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 16, 4, 5, 8, 10, 4, 12 };
		
		boolean isDivBy10 = Arrays.stream(numbers)
			  .anyMatch(number -> number % 10 == 0);
		System.out.println("1st isDivBy10: " + isDivBy10);
		
		OptionalInt opt =  Arrays.stream(numbers)
			  .filter(number -> number % 4 == 0)
			  .findFirst();
		if(opt.isPresent()) {
			System.out.println("2nd firstDivBy4: " + opt.getAsInt());
		}
		
		OptionalInt isDivBy5 = Arrays.stream(numbers)
			  .filter(number -> number % 5 == 0)
			  .findAny();
		if(isDivBy5.isPresent()) {
			System.out.println("2nd firstDivBy5: " + isDivBy5.getAsInt());
		}	
	}
}
