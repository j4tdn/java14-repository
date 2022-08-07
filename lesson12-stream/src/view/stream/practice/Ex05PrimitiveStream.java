package view.stream.practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex05PrimitiveStream {
	public static void main(String[] args) {
		
		// Object Stream <> Stream<T>
		
		//Primitive Stream => IntStream, LongStream
		
		int[] digits = {1,2,3,4,5};
		OptionalInt opt = Arrays.stream(digits).max();
		System.out.println(opt.getAsInt());
	}
}
