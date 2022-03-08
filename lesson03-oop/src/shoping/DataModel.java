package shoping;

import java.time.LocalDateTime;

public class DataModel {
	private DataModel() {
		// TODO Auto-generated constructor stub
	}
	public static Oder[] createOders(Item[] items, Customer[] customers) {
		ItemDetail[] firstItemDetails = {
				new ItemDetail(items[0],1),
				new ItemDetail(items[1], 2)
		};
		ItemDetail[] secondItemDetails = {
				new ItemDetail(items[2],2),
				new ItemDetail(items[3], 3)
		};
		return new Oder[] {
				new Oder(customers[0], firstItemDetails, LocalDateTime.of(2020, 5, 5, 10, 10)),
				new Oder(customers[1], secondItemDetails, LocalDateTime.now())
		};
	}
	public static Item[] initialItems() {
		return new Item[] {
				new Item("SS10+", "SSGLX S10+", "Black", 20580 ),
				new Item("Iphone8", "Iphone8", "Black", 22600 ),
				new Item("Fridge LG-X12", "Fridge LG-X12 detail", "White", 28000 ),
				new Item("sdasd", "electric Fan 7", "Black", 1200 ),
		};
	}
	public static ItemGroup[] initialItemGroups(Item[] items) {
		return new ItemGroup[] {
				new ItemGroup(123 , "Phone" , new Item[] {items[0], items[1]}),
				new ItemGroup(234 , "Fridge" , new Item[] {items[2]}),
				new ItemGroup(345 , "Electric" , new Item[] {items[3]}),
		};
	}
	public static Customer[] innitialCustomer() {
		return new Customer[] {
			new Customer("John", "13213213", true, "Milan"),
			new Customer("Susan", "13223213", false, "Kiev")
		};
		}
}
