package view.stream.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
  Mapping:
	  A very common data processing idiom is to select information from certain object.
	  For example, in SQL you can select a particular from a table.
	  The Streams API provides similar facilities the map and flatMap method.
  
 
  flapMap:
	+ which is used to flatten a stream of collections to a stream of elements combined from all
	collections
	+ The flatMap() operation has the effect of applying a one-to-many transformation to the
	elements of the stream, and then flattening the resulting elements into a new stream.
 */
public class Ex02MapFlatMap {
	public static void main(String[] args) {
		Integer[][] matrix = {
				{1,2,3},
				{2,3,4},
				{3,4,5}
		};
		
		// Tìm những phần tử lẻ trong ma trận
		for(int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] % 2 != 0) {
					System.out.println(row + ", " + column);
				}
			}
		}
		
		
		List<Integer> list = Arrays.stream(matrix) // Stream<Integer[]>
			      .flatMap(Arrays::stream) // Stream<Integer>
			      .collect(Collectors.toList());
		System.out.println("=================");
		int[][] primitiveMatrix = {
				{1,2,3},
				{2,3,4},
				{3,4,5}
		};
		
		System.out.println("======XYZ=======");
		
		Arrays.stream(primitiveMatrix) // Stream<int[]>
		      .flatMapToInt(array -> Arrays.stream(array)) // IntStream
		      .filter(digit -> digit % 2 != 0)
		      .distinct()
		      .forEach(digit -> System.out.print(digit + " "));
		
		List<String> player01 = Arrays.asList("2 cơ", "3 chuồn", "10 rô");
		List<String> player02 = Arrays.asList("2 bích", "3 rô", "7 rô");
		List<String> player03 = Arrays.asList("4 cơ", "3 cơ", "8 rô");
		
		List<List<String>> cards = Arrays.asList(player01, player02, player03);
		
		// Tìm những quân bài là 2 còn lại trong 3 người chơi
		cards.stream() // Stream<Integer[]>
			 .flatMap(Collection::stream) // Stream<String>
			 .collect(Collectors.toList());
		
		// Array of Array to Array
		// Collection of Collection to Collection
	}
}
