package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		List<Integer> uniquedigits	= numbers.stream()
											.filter(n -> {
												int count = 0;
												for(Integer number : numbers) {
													if (number == n) {
														count ++;
													}
												}
												return count == 1;
											}).collect(Collectors.toList());
		System.out.println(uniquedigits);
		
		List<Integer> nonUniquedigits	= numbers.stream()
											.filter(n -> {
												int count = 0;
												for(Integer number : numbers) {
													if (number == n) {
														count ++;
													}
												}
												return count > 1;
											})
											.distinct()
											.collect(Collectors.toList());
		
		System.out.println(nonUniquedigits);
	}
}
