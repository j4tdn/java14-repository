package view.stream.practice;

import java.util.Arrays;

public class Ex01FilterWithSkipLimit {
	public static void main(String[] args) {
		int[] digits = { 1, 3, 9, 4, 9, 8, 8, 7 };
		
		// find first 3 max element in digits
		// 9, 8, 7
		// Collection --> Stream: collection.stream()
		// Array	  --> Stream: Arrays.stream(array)
		
		// IntStream: hỗ trợ thêm các method cho kiểu nguyên thủy
        int[] elements = Arrays.stream(digits)	// IntStream
		      .distinct()						// IntStream
		      .sorted()							// IntStream
		      .toArray();
		if(elements.length > 3) {
			elements = Arrays.stream(elements).skip(elements.length - 3).toArray();
		}
		System.out.println(Arrays.toString(elements));
	}
}
