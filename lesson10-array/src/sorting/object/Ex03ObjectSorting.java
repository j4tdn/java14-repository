package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import utils.ArrayUtils;

public class Ex03ObjectSorting {
	public static void main(String[] args) {
		Item[] items = mockData();
		// Option 1
		//Arrays.sort(items);
		// Restriction
		// Only handle one sorting business for each object
		
		
		// Option2: Comparator > Comparable
		// Custom many ways of sorting
		

		Arrays.sort(items,new Comparator<Item>() {
			public int compare(Item o1, Item o2) {
				
				// desending by id
				// null first
				Integer i1 =o1.getId();
				Integer i2 = o2.getId();
				
				if(i1==null && i2!=null) {
					return -1;
				}
				if(i2==null) {
					return 1;
				}
				return i1-i2;
			};
		});
		ArrayUtils.printf(items);
	}

	private static Item[] mockData() {
		return new Item[] { new Item(102, "Item A", 100d), 
				new Item(null, "Item B", 180d), 
				new Item(130, "Item C1", 123d),
				new Item(null, "Item C2", 180d),
				new Item(130, "Item C3", 140d),
				new Item(108, "Item D", 220d), 
			};
	}
}
