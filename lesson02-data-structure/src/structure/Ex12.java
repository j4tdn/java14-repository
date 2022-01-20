package structure;
/**
 * 
 * mảng đối tượng
 *
 */
public class Ex12 {
	private static Item[] items;

	public static void main(String[] args) {
		//[null, null, null, null]
		Item[] items = new Item[4];
		Item itemX = new Item(102, 401, null, 0);
		items[0] = itemX;
		items[2] = new Item(103, 403, "Item 403", 600);
		Item[]result = findItems(items);
		print(result);
	}
	
	private static void print(Item[] result) {
		// TODO Auto-generated method stub
		
	}

	private static Item[] findItems(Item[] items2) {
		Item[] result = new Item[items2.length];
		int run = 0;
			if (item !=null && item.)
		return null;
	}

	// Viết hàm để "in ra"..void danh sách các phần tử trong "mảng items" input-param
	
//	private static void print(Item[] result) {
//		for (Item item: items) {
//			System.out.println(item);
		

	}

