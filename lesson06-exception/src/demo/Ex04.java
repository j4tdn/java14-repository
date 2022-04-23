package demo;

import java.util.Optional;

import bean.Item;

/*
 *  bài toán: khởi tạo giá trị cho bài toán chưa tồn tại 
 */
public class Ex04 {
	public static void main(String[] args) {
		Optional<Item> opItem = findItemById(8); // exception3

		if (opItem.isPresent()) {
			Item item = opItem.get();
			System.out.println("Current Item: " + item);
			item.setName("Special Item");
			System.out.println("After Updated: " + item);
		} else {
			System.out.println("Empty item");
		}

	}

	// null, non-null --> Optional<Item>
	private static Optional<Item> findItemById(int itemId) {
		Item found = null;
		Item[] items = findAll();
		/**
		 * Current Item: null Exception in thread "main" java.lang.NullPointerException:
		 * Cannot invoke "bean.Item.setName(String)" because "item" is null at
		 * demo.Ex04.main(Ex04.java:14)
		 * 
		 * JAVA08: Optional<T>
		 */
		for (Item item : items) {
			if (item.getId() == itemId) {
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
		return new Item[] { new Item(1, "Item1"), new Item(2, "Item2"), new Item(3, "Item3"), new Item(4, "Item4"),
				new Item(5, "Item5") };
	}
}
