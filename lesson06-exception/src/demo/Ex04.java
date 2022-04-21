package demo;

import java.util.Optional;

import bean.Item;

/**
 * Bài toán: Khởi tạo giá trị cho đối tượng chưa tồn tại
 */
public class Ex04 {
	public static void main(String[] args) {
		Optional<Item> optItem = findItemById(2);
		/*
			Exception in thread "main" java.lang.NullPointerException
			at demo.Ex04.main(Ex04.java:13)
		 */
		// JAVA08: Optional<T>
		
		if (optItem.isPresent()) {
			Item item = optItem.get();
			System.out.println("Current Item: " + item);
			item.setName("Special Item");
			System.out.println("After Updated: " + item);
		} else {
			System.out.println("Empty item");
		}
	}
	
	// null, non-null --> Optional<Item>
	// Optional: 100% non-null
	// T: null, non-null
	private static Optional<Item> findItemById(int itemId) {
		Item found = null;
		Item[] items = findAll();
		for (Item item: items) {
			if(item.getId() == itemId) {
				found = item;
				break;
			}
		}
		return Optional.ofNullable(found);
	}
	
	/**
	 * Load data from database
	 */
	private static Item[] findAll() {
		return new Item[] {
				new Item(1, "Item 1"),
				new Item(2, "Item 2"),
				new Item(3, "Item 3"),
				new Item(4, "Item 4")
		};
	}
}
