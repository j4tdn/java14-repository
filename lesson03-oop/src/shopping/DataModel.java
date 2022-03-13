package shopping;

import java.time.LocalDateTime;

public class DataModel {

	private DataModel() {

	}

	public static Order[] createOrders(Item[] items, Customer[] customers) {
		ItemDetail[] firstItemDetails = { new ItemDetail(items[0], 1), new ItemDetail(items[1], 2) };

		ItemDetail[] secondItemDetails = { new ItemDetail(items[2], 2), new ItemDetail(items[3], 3) };

		return new Order[] { new Order(customers[0], firstItemDetails, LocalDateTime.of(2022, 5, 5, 10, 10, 20)),
				new Order(customers[1], secondItemDetails, LocalDateTime.now()) };
	}

	public static ItemGroup[] initialItemGroups(Item[] items) {
		return new ItemGroup[] { new ItemGroup(123, "Phone", new Item[] { items[0], items[1] }),
				new ItemGroup(234, "Fridge", new Item[] { items[2] }),
				new ItemGroup(345, "Electric Fan", new Item[] { items[3] }) };
	}

	public static Item[] initialItems() {
		return new Item[] { new Item("SS10+", "SamSung Galaxy S10+", "Black", 20580),
				new Item("Iphone8", "Iphone 8", "Black", 22600),
				new Item("Fridge LG-X12", "Fridge LG-X12 detail", "White", 28000),
				new Item("EFan 7+", "Electric Fan 7", "Black", 1200) };
	}

	public static Customer[] initialCustomers() {
		return new Customer[] { new Customer("John", "034859315", true, "Milan"),
				new Customer("Susan", "090800266", false, "Kiev") };
	}

}
