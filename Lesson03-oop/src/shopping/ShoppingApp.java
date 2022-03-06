package shopping;

import static shopping.DataModel.*;

import java.time.LocalDate;

public class ShoppingApp {
	public static void main(String[] args) {

		// B1: initial Item , Customer Data
		Item[] items = initialItems();
		Customer[] customers = initialCustomers();

		// b2: Do shopping
		Order[] orders = DataModel.createOrder(items, customers);

		// b3: Do calculation and export build
		ShoppingUtils.export(orders, LocalDate.of(2022, 5, 5));
		
		// find item in Phone group which have price greater than 20000
		ItemGroup[] itemGroups = initialItemGroups(items);
		
		for(ItemGroup itemGroup : itemGroups)
		{
			if(itemGroup.getName().equals("phone"))
			{
				Item[] currentItems = itemGroup.getItem();
				for(Item item : currentItems)
				{
					if(item.getPrice() > 20000)
					{
						System.out.println(item);
					}
				}
			}
		}
		
	}
	 


}
