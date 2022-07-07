package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;

public class Ex01VnVehicleModel {
	public static void main(String[] args) {
		// accept saving key:null HashMap,LinkedHashMap
		// no TreeMap
		//Map<Integer, String> modelMap = new LinkedHashMap<>();
//		Map<Integer, String> modelMap = new TreeMap<>(
//				new Comparator<Integer>() {
//					@Override
//					public int compare(Integer o1, Integer o2) {
//						//null first
//						if(o1 == null) {
//							return -1;
//						}
//						if(o2 == null) {
//							return 1;
//						}
//						return o1-o2;
//					}
//				});
		Map<Integer, String> modelMap = new TreeMap<>(
				Comparator.nullsFirst(Comparator.comparing(Function.identity()))
				);
		modelMap.put(92, "Quang Nam");
		modelMap.put(43 ,"Da Nang");
		modelMap.put(75, "Hue");
		modelMap.put(74, "Quang Tri");
		modelMap.put(43, "DN");
		modelMap.putIfAbsent(43, "Da Nang v");
		modelMap.put(null, "Undifined");
		
		System.out.println("size "+modelMap.size());
		
		
		java.util.Set<Integer> keys = modelMap.keySet();
		for(Entry<Integer, String> model: modelMap.entrySet()) {
			System.out.println(model);
		}
		System.out.println("=========Keu iterator========");
		for(Integer key:keys) {
			System.out.println(key +"-> "+modelMap.get(key));
		}
		
		System.out.println("===========GET || DEFAULT============");
		
		int inputSearch =74;
		String value = modelMap.getOrDefault(inputSearch,"Undefined");
		System.out.println(value);
	}
}
