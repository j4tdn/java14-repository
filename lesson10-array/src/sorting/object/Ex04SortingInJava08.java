package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import bean.Item;
import utils.ArrayUtils;

public class Ex04SortingInJava08 {
	public static void main(String[] args) {
		Item[] items = mockData();
		
		// Arrays.sort(items, (i1,i2) -> i1.getId()-i2.getId());
		// Arrays.sort(items, Comparator.comparing(Comparator.nullsFirst(Comparator.)));
		// null first
		
		Arrays.sort(items,comparing(Item::getPrice,nullsFirst(naturalOrder()))
				.thenComparing(Item::getId));		
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
