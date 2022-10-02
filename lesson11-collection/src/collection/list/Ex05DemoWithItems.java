package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Item;
import utils.CollectionUtils;

public class Ex05DemoWithItems {
	public static void main(String[] args) {
		/**
		 * List --> override equals --> make sure remove, contain works correctly
		 * instead of using default equal method to compare address
		 * 
		 * Cứ mặc định tạo class ra và override lại hàm equals
		 */
		
		List<Item> items = getItems();
		System.out.println("size: " + items.size()); // 5
		
		// click delete 
		// equals: default operator == 
		// duyệt trong items nhưng lại compare giá trị địa chỉ của đối tượng 
		
		Item removedItem = new Item(4, 104, "Item 4", 223d);
		//items.remove(removedItem);
		boolean isExist = items.contains(removedItem);
		System.out.println("is exist: " + isExist);
		System.out.println("size after remove : " + items.size());
	
	    System.out.println("===========Sorting===========");
	    // Array.sort(elements);
	    // Array.sort(elements,Comparator<T>);
	    // Before Java08
	    
	    //Collections.sort(list);
	    //Collections.sort(list, Comparator<>);
	    
	    // After Java08
	    // items.sort(Comparator<T>>;
	    items.sort(Comparator.comparing(Item::getPrice,Comparator.reverseOrder()));
	    CollectionUtils.printObject(items);
	}
	private static List<Item> getItems(){
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, 101, "Item 1", 220d));
		items.add(new Item(2, 102, "Item 2", 221d));
		items.add(new Item(3, 103, "Item 3", 222d));
		items.add(new Item(4, 104, "Item 4", 223d));
		items.add(new Item(5, 105, "Item 5", 224d));
		
		 return items;
	}
}
