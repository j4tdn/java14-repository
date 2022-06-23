package sorting.object;
import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import utils.ArrayUtils;

public class Ex04SortingJava08 {
//	public static void main(String[] args) {
//		Item[] item = mockData();
//		
//		
//		Arrays.sort(items, (i1,i2) -> {
//			return i1.
//		});
//		
//		ArrayUtils.printf(items);
//	}
	private static Item[] mockData() {
		return new Item[] {
				new Item(null, "Item A", 100d), 
				new Item(174, "Item B", 180d),
				new Item(null, "Item C1", 140d), 
				new Item(130, "Item C2", 123d),
				new Item(130, "Item C3", 150d),
				new Item(108, "Item D", 220d) 
		};
	}
}
