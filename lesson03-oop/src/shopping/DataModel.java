package shopping;

import java.time.LocalDateTime;

public class DataModel {
	private DataModel() {
		
	}
	public static Order[] createOrders(Item[] items, Customer[] customers) {
		ItemDetail[] firstitemDetails = {
				new ItemDetail(items[0], 1),
				new ItemDetail(items[1], 2)

		};
		ItemDetail[] seconditemDetails = { 
				new ItemDetail(items[2], 2), 
				new ItemDetail(items[3], 3)

		};
		return new Order[]{ 
				new Order(customers[0], firstitemDetails, LocalDateTime.now()),
				new Order(customers[1], seconditemDetails, LocalDateTime.now())

		};
	}
	public static Item[] initialItem() {
		return new Item[] { 
				new Item("SS10+", "SamSung Galaxy S10+", "Black", 20580),
				new Item("IP8", "Iphone 8", "Black", 22680), 
				new Item("IP13", "Iphone 13 pro max", "White", 29990),
				new Item("LG1", "LG-X12", "Pink", 17000), };
	}

	public static Customer[] initialCustomer() {
		return new Customer[] { 
				new Customer("John", "01234567", true, "New york"),
				new Customer("Lie", "01632423", false, "Tokyo"),
				new Customer("Lion", "01543521", true, "Japan"), };
	}
}
