package view.stream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02MapFlatMap {
	public static void main(String[] args) {
		Integer[][] maxtrix = {
				{ 1, 2, 3 }, 
				{ 2, 3, 4 },
				{ 3, 4, 5 } 
		};
		// find one elements in matrix

		for(int row = 0; row < maxtrix.length; row++) {
			for(int column = 0; column < maxtrix[row].length; column++) {
				if(maxtrix[row][column] % 2 != 0) {
					System.out.println(row + ", " + column);
				}
			}
		}
		List<Integer> list = Arrays.stream(maxtrix) // Stream<Integer[]>
				  .flatMap(Arrays::stream) // Stream<Integer>
				  .collect(Collectors.toList());
		
		int[][] primativeMaxtrix = {
				{ 1, 2, 3 }, 
				{ 2, 3, 4 },
				{ 3, 4, 5 } 
		};
		
		System.out.println("=================");
		Arrays.stream(primativeMaxtrix) // Stream<Int[]>
			  .flatMapToInt(array -> Arrays.stream(array)) // Stream<Int>
			  .filter(digit -> digit % 2 != 0)
			  .distinct()
			  .forEach(digit -> System.out.print(digit + " "));
		
		
		List<String> player01 = Arrays.asList("2 cơ ", "6 rô", " 5 chuồn");
		List<String> player02 = Arrays.asList("2 rô ", "3 rô", " 10 chuồn");
		List<String> player03 = Arrays.asList("6 cơ ", "7 rô", " 8 chuồn");

		List<List<String>> cards = Arrays.asList(player01, player02, player03);
		cards.stream() // Stream<Integer[]>
				  .flatMap(Collection::stream) // Stream<String>
				  .collect(Collectors.toList());
		
		// Array of Array to Array
		// Collection of Collection to Collection
	}
}
