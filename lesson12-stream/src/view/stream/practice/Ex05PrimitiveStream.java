package view.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;

public class Ex05PrimitiveStream {
	public static void main(String[] args) {
		// Object Stream -> Stream<T>
		// Each element is an Object(Integer, Item, Student, Customer)
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		Optional<Integer> opt = numbers.stream().min(Comparator.comparing(Function.identity()));
		System.out.println(opt.get());
		/*
		 	khi numbers.stream() thì nó ra Stream<Integer> ~ Stream<T>
		 */
		
		// int[], long[], double[]
		// Primitive Stream -> IntStream, LongStream, DoubleStream
		// Each element is primitive value
		// Fully support as Object Stream and .. specific methods for primitive type
		// as sum, sub, max, min 
		int[] digits = {1,2,3,4,5};
		OptionalInt optInt = Arrays.stream(digits).min();
		System.out.println(optInt.getAsInt());
	}
}
