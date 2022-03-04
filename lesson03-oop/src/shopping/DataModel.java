package shopping;

import java.time.LocalDateTime;

public class DataModel {

	private DataModel() {
	}
	
	public static Order[] createOrders(Item[] items,Customer[] customers) {
		ItemDetail[] firstItemDetails = {
				new ItemDetail(items[0], 1),
				new ItemDetail(items[1], 2)
		};
		
		ItemDetail[] secondItemDetails = {
				new ItemDetail(items[2], 3),
				new ItemDetail(items[3], 2)
		};
		
		
		return new Order[]{
				new Order(customers[0], firstItemDetails, LocalDateTime.now()),
				new Order(customers[1], secondItemDetails, LocalDateTime.now())
		};
	}
	
	public static Item[] initItems() {
		return new Item[] {
			new Item("SS10+", "SSGS10+", "Black", 20500),
			new Item("IP8", "Iphone8", "Black", 22500),
			new Item("FLG-X12", "Fridge LG-X12", "White", 28100),
			new Item("IF7+", "Electric Fan 7+", "White", 12500)
		};
	}
	
	public static Customer[] initialCustomers() {
		return new Customer[] {
			new Customer("John", "034945945", true, "Milan"),
			new Customer("Susan", "03232323", false, "Kiev")
		};
	}
	
}
