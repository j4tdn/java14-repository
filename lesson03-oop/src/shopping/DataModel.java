package shopping;

import java.time.LocalDateTime;

public class DataModel {

	public DataModel() {
	}

	public static Order[] createOrders(Item[] items, Customer[] customers) {
		ItemDetail[] firstItemDetails = { new ItemDetail(items[0], 1), new ItemDetail(items[1], 2) };

		ItemDetail[] secondItemDetails = { new ItemDetail(items[2], 2), new ItemDetail(items[3], 3) };

		return new Order[] { new Order(customers[0], firstItemDetails, LocalDateTime.now()),
				new Order(customers[1], secondItemDetails, LocalDateTime.now()) };
	}

	public static Item[] initialItems() {
		return new Item[] { new Item("SS10+", "SamSung Galaxy S10+", "Black", 20580),
				new Item("Iphone8", "Iphone 8", "Black", 21580), new Item("Fridge", "Fridge LG-X12", "White", 34580),
				new Item("EFan", "Electric Fan", "Black", 20580), };
	}

	public static Customer[] initialCustomer() {
		return new Customer[] { new Customer("John", "03485923", true, "Milan"),
				new Customer("Susan", "0934566", false, "Kiev"), };
	}

}
