package structure;

import java.util.Arrays;

public class Ex12 {

	public static void main(String[] args) {
		// [null] [null] v [null]
		Item[] items = new Item[4];

		Item itemX = new Item(102, 401, "Item 401", 200);
		items[0] = itemX;
		items[2] = new Item(103, 403, "Item 403", 600);

		Item[] result = findItems(items);
		print(result);
	}

	// Viet ham de tim nhung mac hang co gia lon hon 500
	private static Item[] findItems(Item[] items) {
		Item[] result = new Item[items.length];
		int run =0;
		for(Item item: items) {
			if(item != null && item.price > 500) {
				result[run] = item;
				run++;
			}
		}
		return Arrays.copyOfRange(result, 0, run);
	}

	// Viet ham in ra danh sach cac phan tu trong items
	// void
	private static void print(Item[] items) {
		for (Item item : items) {
			System.out.println(item);
		}
	}

}
