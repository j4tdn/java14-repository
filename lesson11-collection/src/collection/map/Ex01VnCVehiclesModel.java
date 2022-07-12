package collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

public class Ex01VnCVehiclesModel {
	public static void main(String[] args) {
		// Map<Integer, String> modelMap = new HashMap<>();
		// LinkedHashMap<Integer, String> modelMap = new LinkedHashMap<>();
		Map<Integer, String> modelMap = new  TreeMap<>(
				Comparator.nullsFirst(Comparator.comparing(Function.identity()))
//				new Comparator<Integer>() {
//					@Override
//					public int compare(Integer i1, Integer i2) {
//						// null first 
//						if(i1 == null) {
//							return -1;
//						}
//						if(i2 == null) {
//							return 1;
//						}
//						return i1 - i2;
//					}
//					
//				}
				);

		modelMap.put(92, "Quảng Nam");
		modelMap.put(43, "Đà Nẵng");
		modelMap.put(75, "Thừa Thiên Huế");
		modelMap.put(74, "Quảng Trị");
		// modelMap.put(43, "ĐN"); if key exists --> override value
		modelMap.putIfAbsent(43, "ĐN"); // if key exists --> do nothing
		modelMap.put(null, "Test City");

		
		System.out.println("size: " + modelMap.size());
		
		Set<Entry<Integer, String>> entrySet =  modelMap.entrySet();
		Set<Integer> keySet = modelMap.keySet();
		
		for (Entry<Integer, String> model : entrySet) {
			System.out.println("model: " + model.getKey() + ", " + model.getValue());
		}
		System.out.println("===================Key Iterator==============");
		for(Integer key: keySet) {
			System.out.println(key + " ---> " + modelMap.get(key));
		}
		System.out.println("=============Get || Default==============");
		int inputSearch = 47; // Trả về giá trị
		String value = modelMap.getOrDefault(inputSearch,"Undefined");
		System.out.println("Value: " + value);
	}
	
}
