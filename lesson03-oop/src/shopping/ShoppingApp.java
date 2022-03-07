package shopping;

import static shopping.DataModel.*;

import java.time.LocalDate;
//import java.util.Arrays;

public class ShoppingApp {

	public static void main(String[] args) {

		// Class ==> static
		// Object ==> non-static, static(not-prefer)

		// B1: Initial Customer Data
		Item[] items = initialItems();
		Customer[] customers = initialCustomer();

		// B2 Do shopping
		Order[] orders = createOrders(items, customers);

		// B3
		//LocalDate promotionDate = LocalDate.of(2022, 5, 5);
		ShoppingUtils.export(orders, LocalDate.of(2022, 5, 5));
		
		
		ItemGroup[] itemGroups = initialItemGroups(items);
		
		for(ItemGroup itemGroup: itemGroups) {
			if(itemGroup.getName().equals("Phone")) {
				Item[] items2 = itemGroup.getItems();
				for(Item item: items2) {
					if(item.getPrice()>21000) {
					System.out.println(item);}
				}
			}
		}
	}

}
