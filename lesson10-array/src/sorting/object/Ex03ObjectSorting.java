package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import bean.Item;
import utils.ArrayUtils;

public class Ex03ObjectSorting {
	public static void main(String[] args) {
		Item[] items = mockData();
		
		// option 1 : Comparable
		// restriction: only handle one sorting business for each object
		// cannot multiple in reality
		// Arrays.sort(items);
		
		// option 2 : Comparator >> Comparable
		// Custom many ways of sorting for each object
		Arrays.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item i1, Item i2) {
				// descending by Id
				// null first
				if(i1 == null) {
					return -1;
				}
				if(i2 == null) {
					return 1;
				}
				if(i1.getId() == null) {
					return -1;
				}
				if(i2.getId() == null) {
					return 1;
				}
				return i2.getId() - i1.getId();
			}
		});
		
		ArrayUtils.printf(items);
		
	}
	
	private static Item[] mockData() {
		return new Item[] {
			new Item(102, "Item A", 100d),
			new Item(172, "Item B", 180d),
			new Item(172, "Item B", 179d),
			new Item(172, "Item B", 190d),
			new Item(169, "Item C", 123d),
			new Item(108, "Item D", 220d)
		};
	}
}
