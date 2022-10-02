package sorting.object;

import java.util.Arrays;
import static java.util.Comparator.*;

import bean.Item;
import utils.ArrayUtils;

public class Ex04SortinginJava08MethodReference {
	public static void main(String[] args) {
		Item[] items = mockData();

		// natureOrder()
		Arrays.sort(items, nullsFirst(comparing(Item::getPrice, nullsFirst(reverseOrder()))).thenComparing(Item::getId,
				reverseOrder()));
		ArrayUtils.printf(items);
	}

	private static Item[] mockData() {
		return new Item[] { 
				new Item(102, "Item A", 100d),
				null, 
				new Item(21, "Item B", 180d),
				new Item(131, "Item C1", 140d), 
				new Item(163, "Item C2", null), 
				null, 
				new Item(130, "Item C3", 140d),
				new Item(108, "Item D", 220d), };
	}
}