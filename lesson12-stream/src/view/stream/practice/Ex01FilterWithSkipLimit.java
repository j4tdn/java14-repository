package view.stream.practice;

import java.util.Arrays;

public class Ex01FilterWithSkipLimit {
	public static void main(String[] args) {
		int[] digits = { 1, 3, 9, 4};
		// Find 3 max elements in digits
		// 9 8 7
		// Collection --> Stream: collection.stream()
		// Array      --> Stream: Arrays.stream(array)
		int[] elements = Arrays.stream(digits) // IntStream
			  .distinct()     // IntStream 1 3 4 7 8 9
			  .sorted()       // IntStream
			  .toArray();
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 6 - 3
		// 5 - 2
		// 4 - 1
		int length = elements.length;
		if (length > 3) {
			elements = Arrays.stream(elements)
					.skip(length-3)
					.toArray();
		}
			  
		System.out.println(Arrays.toString(elements));
	}
}
