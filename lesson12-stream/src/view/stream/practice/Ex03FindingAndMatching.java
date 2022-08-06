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
		// Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
		int[] numbers = {1, 2, 18, 4, 5, 8, 10, 4, 12};
		
		// 1st: is there any element that is divisible by 10
		boolean isDivBy10 = Arrays.stream(numbers)
			  .anyMatch(number -> number % 10 == 0);
		System.out.println("1st isDivBy10: " + isDivBy10);
		
		// 2nd: find the first element that is divisible by 4
		OptionalInt opt = Arrays.stream(numbers)
			  .filter(number -> number % 4 == 0)
			  .findFirst();
		if(opt.isPresent()) {
			System.out.println("2nd firstDivBy4: " + opt.getAsInt());
		}
		
		// 3nd: find the element that is divisible by 5 in the list
		
		// 4th: does all elements less than 100
		
		// 5th: does no elements greater than 0
	}
}
