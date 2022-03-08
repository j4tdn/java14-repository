package shopping;

import static shopping.DataModel.createOrder;
import static shopping.DataModel.initialCustomers;
import static shopping.DataModel.initialItem;
import static shopping.DataModel.initialItemGroups;

import java.time.LocalDate;

public class ShoppingApp {
	public static void main(String[] args) {
		
		Item[] items = initialItem();
		// find Items in "Phone" group Which have price greater than 20000
		ItemGroup[] itemGroups=initialItemGroups(items);
		
		Customer[] customers = initialCustomers();
		Order[] orders = createOrder(items, customers);

		ShoppingUtils.export(orders, LocalDate.of(2022, 5, 5));
		
		for(ItemGroup itemGroup:itemGroups) {
			if(itemGroup.getName().equals("Phone")) {
				Item[] currentItems= itemGroup.getItems();
				for(Item item:currentItems) {
					if(item.getPrice()>20000) {
						System.out.println(item);
					}
				}
			}
		}

	}
	

}
