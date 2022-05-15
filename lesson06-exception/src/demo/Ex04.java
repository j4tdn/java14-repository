package demo;

import bean.Item;

/*
 * bài toán : khởi tạo giá trị cho đối tượng chưa tồn tại
 */

public class Ex04 {
	public static void main(String[] args) {
		Item item = findItemById(4);
		System.out.println("Current Item: " + item);
		
		if(item != null) {
			item.setName("Special Item");
			System.out.println("After Updated: " + item);
		}else {
			System.out.println("Empty Item");
		}
		
	}
	
	private static Item findItemById(int itemID) {
		Item found = null;
		Item[] items = findAll();
		for(Item item : items) {
			if(item.getId() == itemID) {
				found = item;
				break;
			}
		}
		return found;
	}
	
	private static Item[] findAll() {
		return new Item[] {
				new Item(1,"Item 1"),
				new Item(2,"Item 2"),
				new Item(3,"Item 3"),
				new Item(4,"Item 4"),
		};
	}
}
