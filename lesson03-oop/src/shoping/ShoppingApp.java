package shoping;

import static shoping.DataModel.*;

import java.time.LocalDate;
import java.util.Arrays;
public class ShoppingApp {
	public static void main(String[] args) {
		//performance
		
		//b1: Initial Customer Data
		Item[] items = initialItems();
		Customer[] customers = innitialCustomer();
		// b2: DO shopping
		Oder[] oders = createOders(items, customers);
		// B3 Do calculation
		ShoppingUtils.export(oders, LocalDate.of(2022, 5, 5));
		//System.out.println(oders);
		//==============================================
		//Find items in "Phone" group with price greater than 20000
		ItemGroup[] itemGroups = initialItemGroups(items);
		for (ItemGroup itemGroup : itemGroups) {
			if(itemGroup.getName().equals("Phone")) {
				Item[] currentItems = itemGroup.getItems();
				for (Item item : currentItems) {
					if(item.getPrice() > 20000) {
						System.out.println(item);
					}
				}
			}
		}
	}

	
}
