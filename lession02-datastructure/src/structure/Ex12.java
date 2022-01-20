package structure;

import java.util.Arrays;

/**
 * Object Arrays
 * @author Oanhpv1008
 *
 */
public class Ex12 {
	public static void main(String[] args) {
		Item [] items= new Item [4];
		Item itemx= new Item(102, 401, "item 401", 400);
		items[0]=itemx;
		items[2]= new Item(103,402,"item 402",600);
		print(items);
		System.out.println("=====================");
		print(findItemsGreaterThan500(items));
	}
	private static void print(Item[] items) {
		for(Item item:items) {
			System.out.println(item);
		}
	}
	private static Item[] findItemsGreaterThan500(Item[]items) {
		Item[]results= new Item[items.length];
		int i=0;
		for(Item item:items) {
			if(item !=null&&item.price>500) {
				results[i++]=item;
			}
		}
		return Arrays.copyOfRange(results, 0,i);
	}
}
