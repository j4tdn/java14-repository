package collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Item;
import utils.CollectionUtils;

public class Ex05DemoWithItems {
	public static void main(String[] args) {
		// List --> override equals --> make sure remove, contain works correctly
		// instead of using default equal method to compare address
		List<Item> items = getItems();
		
		System.out.println("size: " +items.size());
		
		// click delete
		// equals: default == 
		Item removedItem = new Item(2, 101, "Item 2", 180d);
		boolean isExist = items.contains(removedItem);
		System.out.println("isExist: " + isExist);
		
		items.remove(removedItem);
		System.out.println("size after remove: " + items.size()); // 5 4 
		
		System.out.println("==============Sorting===========");
		// Arrays.sort(elements);
		// Arrays.sort(elements, Comparator<T>);
		
		// Before Java08
		// Collections.sort(list);
		// Collections.sort(list, Comparator<T>);

		// After Java08
		// items.sort(Comparator<T>);
		
		items.sort(Comparator.comparing(Item::getPrice, Comparator.reverseOrder()));
		CollectionUtils.printo(items);
		
		// Array: Fixed-Size, No need Add, Remove
		// List: Dynamic-Size, Need Add, Remove

	}

	private static List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, 101, "Item 1", 220d));
		items.add(new Item(2, 101, "Item 2", 180d));
		items.add(new Item(3, 102, "Item 3", 260d));
		items.add(new Item(4, 102, "Item 4", 120d));
		items.add(new Item(5, 104, "Item 5", 80d));
		return items;
	}
}
