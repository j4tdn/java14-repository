package view.stream.practice;

import java.util.Arrays;

public class Ex01FilterWithSkipLimit {
	public static void main(String[] args) {
		int[] digits = {1, 3, 9, 4, 9, 8, 8, 7};
		// Find 3 max elements in digits
		// 9, 8, 7
		// Collection --> Stream: collection.stream()
		// Array	  --> Stream: Arrays.stream(array)
		
		int[] elements = Arrays.stream(digits) // IntStream
			  .distinct()	  // IntStream
			  .sorted()		  // IntStream
			  .toArray();
		int length = elements.length;
		if(length > 3) {
			elements = Arrays.stream(elements)
							.skip(length - 3)
							.toArray();
		}
		System.out.println(Arrays.toString(elements));
	}
}
