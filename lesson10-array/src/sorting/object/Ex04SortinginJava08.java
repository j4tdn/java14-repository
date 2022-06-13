package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import utils.ArrayUtils;

public class Ex04SortinginJava08 {
	public static void main(String[] args) {
		Item [] items= mockData();
		
		
		Arrays.sort(items, (i1,i2)->i1.getId()-i2.getId());
		ArrayUtils.printf(items);
	}
	private static Item[] mockData() {
		return new Item[] { new Item(102, "Item A", 100d), 
				new Item(21, "Item B", 180d), 
				new Item(130, "Item C1", 123d),
				new Item(163, "Item C2", 180d),
				new Item(130, "Item C3", 140d),
				new Item(108, "Item D", 220d), 
			};
	}
}
