package shopping;

import static shopping.DataModel.*;

import java.time.LocalDate;
import java.util.Arrays;

public class ShoppingApp {
	public static void main(String[] args) {

		// B1: Initial Item,Customer Data
		Item[] items = initItems();
		Customer[] customers = initialCustomers();

		// B2 : Do Shopping
		Order[] orders = createOrders(items, customers);
		
		

		// B3 : Do calculation and Export bill
		ShoppingUtil.export(orders, LocalDate.of(2022, 5, 5));
		
		//inittial itemGroups && Find items in "phone" group which have price greater than 2000
		ItemGroup[] itemGroups = initialItemGroup(items);
		for(ItemGroup itemGroup : itemGroups) {
			String nameItemGroup = itemGroup.getName();
			if(nameItemGroup.equals("phone")) {
				Item[] curentItems = itemGroup.getItem();
				for(Item item : curentItems) {
					if(item.getPrice() > 20000) {
						System.out.println(item);
					}
				}
			}
		}
		
//		Item[] curentItems = ShoppingUtil.findItems(itemGroups,20000,"iphone");
//		System.out.println(Arrays.toString(curentItems));

	}

	

}
