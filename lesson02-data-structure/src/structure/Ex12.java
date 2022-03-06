package structure;

import java.util.Arrays;

/**
 * Mảng đối tượng
 */
public class Ex12 {
	public static void main(String[] args) {
		// [itemX, null, itemY, null]
		Item[] items = new Item[4];
		
		Item itemX = new Item(102, 401, "Item 401", 400);
		items[0] = itemX;
		
		items[2] = new Item(103, 403, "Item 403", 600);
		
		Item[] result = findItems(items);
		print(result);
	}
	
	// Viết 1 hàm để tìm "những mặt hàng" có giá > 500
	private static Item[] findItems(Item[] items) {
		Item[] result = new Item[items.length];
		int run = 0;
		for (Item item: items) {
			if (item != null && item.price > 500) {
				result[run] = item;
				run++;
			}
		}
		return Arrays.copyOfRange(result, 0, run);
	}
	
	// Viết hàm để "in ra">>void danh sách các phần tử trong "mảng items" input-param
	private static void print(Item[] items) {
		for (Item item: items) {
			System.out.println(item);
		}
	}
	
}