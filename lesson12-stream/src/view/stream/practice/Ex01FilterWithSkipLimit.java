package view.stream.practice;

import java.util.Arrays;

public class Ex01FilterWithSkipLimit {
	public static void main(String[] args) {
		int [] digits = {1,3,9,4,9,8,8,7};
		// find first 3 max elements in digits
		int[]elements = Arrays.stream(digits).distinct().sorted().toArray();
		int length = elements.length;
		if(length > 3 ) {
			elements = Arrays.stream(elements).skip(length -3 ).toArray();
		}
		System.out.println(Arrays.toString(elements));
		
	}
}
