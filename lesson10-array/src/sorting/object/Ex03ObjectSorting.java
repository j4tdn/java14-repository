package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import utils.ArrayUtils;

public class Ex03ObjectSorting {
	public static void main(String[] args) {
		Item[] items = mockData();

		// Option 1: Comparable
		// Restriction: Only handle ONE sorting buiness for each object
		// cannot multiple in reality
		Arrays.sort(items);

		// Optine 2: Comparator >> Comparable
		// Custom many ways of sorting for each object

		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item item1, Item item2) {
				// descending by Id
				// null first
				
				Integer i1 = item1.getId();
				Integer i2 = item2.getId();


				/* 
				if (i1 == null && i2 != null) {
					return -1;
				}

				if (i2 == null) {
					return 1;
				} 
				*/
				if(i2 == null) {
					return -1;
				}
				
				// i2 != null 
				if(i1 == null) {
					return 1;
				}
				
				return i1 - i2;
			}
		});

		ArrayUtils.printf(items);
	}

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
