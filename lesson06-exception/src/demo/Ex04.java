package demo;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		Item item = findItemById(1);
		System.out.println("Current Item: "+item);
		/**
		 * Exception in thread "main" java.lang.NullPointerException
			at demo.Ex04.main(Ex04.java:13)
		 */
		item.setName("Special Item");

		System.out.println("After Update: "+item);

	}

	private static Item findItemById(int itemId) {
		Item found = null;
		Item[] items = findAll();
		for (Item item : items) {
			if (item.getId() == itemId) {
				found = item;
				break;
			}
		}
		return found;
	}

	private static Item[] findAll() {
		return new Item[] { 
				new Item(1, "Item 1"), 
				new Item(2, "Item 2"), 
				new Item(3, "Item 3"),
				new Item(4, "Item 4"),
		};
	}
}
