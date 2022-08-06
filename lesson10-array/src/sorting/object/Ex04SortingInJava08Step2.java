package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

import bean.Item;
import utils.ArrayUtils;

public class Ex04SortingInJava08Step2 {
	public static void main(String[] args) {
		Item[] items = mockData();
		
		// nullsFirst(naturalOrder || reverseOrder)
		Arrays.sort(items, 
					nullsFirst(
							comparing(Item::getPrice, nullsFirst(reverseOrder()))
							.thenComparing(Item::getId, nullsLast(naturalOrder()))
					)
		);
		
		ArrayUtils.printf(items);
	}
	
	private static Item[] mockData() {
		return new Item[] {
			new Item(102, "Item A", 100d),	
			null,
			new Item(null, "Item Z", 180d),	
			new Item(130, "Item C1", 120d),
			null,
			new Item(130, "Item C2", 180d),
			new Item(130, "Item C3", null),
			new Item(108, "Item A2", 220d)	
		};
	}
}
