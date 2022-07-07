package collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Item;
import utils.CollectionUtils;

public class Ex05DemoWithItems {
	public static void main(String[] args) {
		
		// List -> override equals -> make sure remove,contains work correctly
		// instead of using default equal method to compare address
		List<Item> items = getItems();
		
		Item removedItem = new Item(2, 101, "Item 2", 180d);
		//items.remove(removedItem);
		boolean isExist = items.contains(removedItem);
		System.out.println(items.size()+"  "+isExist);
		
		
		// Sorting
		// items.sort(Comparator<T>)
		items.sort(Comparator.comparing(Item::getPrice,Comparator.reverseOrder()));
		CollectionUtils.printo(items);
		System.out.println("=======================");
		items.sort(Comparator.comparing(Item::getItemId,Comparator.reverseOrder()));
		CollectionUtils.printo(items);
	}

	private static List<Item> getItems() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, 101, "Item 1", 220d));
		items.add(new Item(2, 101, "Item 2", 180d));
		items.add(new Item(3, 102, "Item 3", 260d));
		items.add(new Item(4, 102, "Item 4", 120d));
		items.add(new Item(5, 101, "Item 5", 80d));
		return items;
	}
}
