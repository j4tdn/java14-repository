package view.stream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02MapFlatMap {
	public static void main(String[] args) {
		int [][] matrix = {
				{1,2,3},
				{2,3,4},
				{3,4,5}
		};
		// find odd elements in matrix
		Arrays.stream(matrix)
		.flatMapToInt(ma -> Arrays.stream(ma))
		.filter(m -> m%2 !=0)
		.forEach(System.out::println);
		;
		
		List<String> player01 = Arrays.asList("2 co","3 chuon","10 ro");
		List<String> player02 = Arrays.asList("2 bich","3 ro","7 ro");
		List<String> player03 = Arrays.asList("4 co","3 co","8 ro");
		List<List<String>> cards = Arrays.asList(player01,player02,player03);
		
		cards.stream()
			
			.flatMap(c ->c.stream())
			.filter(c -> c.contains("2"))
			;
	}
}
