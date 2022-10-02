package bai2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Exercise02 {
	public static void main(String[] args) {
		List<Character> list1 = Arrays.asList('a','a','a','a','b','a','b','b','b','d','d','c');

		List<Character> list2 = Arrays.asList('a','a','a','a','c','c','d','c','e','c');
		
		Map<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < list1.size(); i++) {
			addElement(map, list1.get(i));
		}
		
		Map<Character, Integer> map2 = new TreeMap<>();
		for (int i = 0; i < list2.size(); i++) {
			addElement(map2, list2.get(i));
		}
		
		List<Integer> max1 = convertMaptoSet(map).stream().sorted((o1, o2) -> o2-o1).collect(Collectors.toList());
		print(map,max1.get(0));
		
		List<Integer> max2 = convertMaptoSet(map2).stream().sorted((o1, o2) -> o2-o1).collect(Collectors.toList());
		print(map2,max2.get(0));
		
		
	}
	
	private static void addElement(Map<Character, Integer> map, Character character) {
		if (map.containsKey(character)) {
			int count = map.get(character) + 1;
			map.put(character, count);
		} else {
			map.put(character, 1);
		}
	}
	
	private static void print(Map<Character, Integer> map,int n) {
		for (Character key : map.keySet()) {
				if (map.get(key) == n) {
					System.out.print(key + " ");
				}
		}
	}
	
	
	private static Set<Integer> convertMaptoSet(Map<Character, Integer> map){
		Set<Integer> number = new HashSet<>(); 
		for (Character key : map.keySet()) {
			number.add(map.get(key));
		}
		
		return number;
	}
	
}
