package demo;

import java.util.Optional;

import bean.Item;

/**
 * Khởi tạo giá trị cho đội tượng chưa tồn tại;
 * @author Oanhpv1008
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		/*
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "bean.Item.setName(String)" because "item" is null
			at demo.Ex04.main(Ex04.java:13)
		 */
		Optional<Item> optItem= findItemById(2);
		if(optItem.isPresent()) {
			Item item= optItem.get();
			item.setName("Special Item");
			System.out.println(item);
		}else {
			System.out.println("Empty item");
		}
	}
	private static Optional<Item> findItemById(int id) {
		Item found =null;
		Item []items=findAll();
		for(Item item:items) {
			if(item.getId()==id) {
				found=item;
				break;
			}
		}
		return Optional.ofNullable(found);
	}
	private static Item[] findAll() {
	    return new Item[] {
	            new Item(1, "Item 1"),
	            new Item(2, "Item 2"),
	            new Item(3, "Item 3"),
	            new Item(4, "Item 4")
	    };
	}
}
