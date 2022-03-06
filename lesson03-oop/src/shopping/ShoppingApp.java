package shopping;

import static shopping.DataModel.*;

import java.time.LocalDate;

public class ShoppingApp {
	public static void main(String[] args) {
		// B1: Initial Item, Customer Data
		Item[] items = initialItems();
		Customer[] customers = initialCustomers();
		
		// B2: Do shopping
		Order[] orders = createOrders(items, customers);
		
		// B3: Do calculation and export bill
		ShoppingUtils.export(orders, LocalDate.of(2022, 5, 5));
		
		// ===========================================
		// Find items in "Phone" group which have price greater than 20000
		ItemGroup[] itemGroups = initialItemGroups(items);
		for(ItemGroup itemGroup: itemGroups) {
			if(itemGroup.getName().equals("Phone")) {
				Item[] phoneItems = itemGroup.getItems();
				for (Item item: phoneItems) {
					if (item.getPrice() > 21000) {
						System.out.println(item);
					}
				}
			}
		}
	}
	
	
	
}