package structure;
import java.util.Arrays;
/**
 * Mang doi tuong
 *	
 */
public class Ex12 {
	public static void main(String[] args) {
		//[null, null, null ,null]
		Item[] items = new Item[4];
		items[0] = new Item(102 , 401 ,"Item 401", 400);
		items[2] = new Item(102 , 401 ,"Item 401", 600);
		Item[] result = findItems(items);
		print(result);
	}
	// viet ham de in ra danh sach cac phan tu trong mang
	private static void print(Item[] items) {
		for(Item item : items) {
			System.out.println(item);
		}
	}
	// viet ham de tim "nhung mat hang " co gia > 500
	private static Item[] findItems(Item[] items) {
		Item[] result = new Item[items.length];
		int run = 0;
		for(Item item : items) {
			if(item != null && item.price > 500) {
				result[run] = item;
				run++;
			}
		}
		return Arrays.copyOfRange(result, 0 , run);
	}
}
