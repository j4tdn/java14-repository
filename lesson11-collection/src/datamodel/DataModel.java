package datamodel;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, 101, "Item 1", 220d));
		items.add(new Item(2, 101, "Item 2", 180d));
		items.add(new Item(3, 102, "Item 3", 260d));
		items.add(new Item(4, 102, "Item 4", 120d));
		items.add(new Item(5, 104, "Item 5", 80d));
		return items;
	}
}
