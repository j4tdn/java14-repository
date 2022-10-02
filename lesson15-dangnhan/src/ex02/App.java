package ex02;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		String text = "aaaababbbbddc";
		Map<Character, Long> map = text.chars()
								.mapToObj(s -> (char)s)
								.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Long max = Collections.max(map.values());
		map.forEach((key,value) -> {
			if(value == max ) {
				System.out.print(key + ",");
			}
		});
	}
}
