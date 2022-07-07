package collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;

public class Ex02SortedByValue {
	public static void main(String[] args) {
		Map<Integer, String> modelMap = new HashMap<>();
		modelMap.put(92, "Quang Nam");
		modelMap.put(43 ,"Da Nang");
		modelMap.put(75, "Hue");
		modelMap.put(74, "Quang Tri");
		modelMap.put(43, "DN");
		modelMap.putIfAbsent(43, "Da Nang v");
		modelMap.put(null, "Undifined");
		Map<Integer, String> sortedMap =sortedByValue(modelMap);
		for(Entry<Integer, String> entry:sortedMap.entrySet()) {
			System.out.println(entry);
		}
		
		List<String> s= Arrays.asList(null,"asd",null,"asdasd",null);
		s.sort(Comparator.nullsLast(Comparator.comparing(Function.identity())));
		s.forEach(System.out::println);
		
	}
	private static Map<Integer, String> sortedByValue (Map<Integer, String> modelMap){
		// b1:map -> set -> List<Entry<K,V>>
		
	
		
		List<Entry<Integer, String>> list = new ArrayList<>(modelMap.entrySet());
		// b2  sort list by value
		
		list.sort(Comparator.comparing(Entry::getValue));
		
		list.sort(new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		// b3 put entry sorted List into new Map
		Map<Integer, String> newMap = new LinkedHashMap<>();
		list.forEach(entry -> newMap.put(entry.getKey(), entry.getValue()));
		
		
		// return new Map
		return newMap;
	}
	private static void sortString(List<String > list) {
		
	}
}	
