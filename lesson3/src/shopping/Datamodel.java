package shopping;

import java.time.LocalDateTime;

public class Datamodel {
	private Datamodel() {
		
	}
	public static Customer[] initialCustomers() {
		return new Customer[] {
				new Customer("John", "0232512321", "Milan", true),
				new Customer("Susan", "0231232122", "Kiev", false)
		};
	}
	public static Item[] initialItems() {
		return new Item[] {
				new Item("SS10+","SamSung Galaxy S10+", "Black", 20580.0),
				new Item("Iphone8","Iphone 8", "Black", 22600.0),
				new Item("Fridge LG-X12","Fridge LG-X12 detail", "White", 28000.0),
				new Item("EFan 7+","Elictric Fan 7", "Black", 1200.0)
		};
	}
	public static ItemGroup[] initialItemGroups(Item[] items) {
		return new ItemGroup[] {
			new ItemGroup("0001","Phone",new Item[] {items[0], items[1]}),
			new ItemGroup("0002","Fan",new Item[] {items[2]}),
			new ItemGroup("0002","Phone",new Item[] {items[3]}),
			};
	}

	public static Order[] createOrder(Item[]items, Customer[]customers) {
		// shopping
				itemDetail[] firstItemDetails= {
						new itemDetail(items[0], 1),
						new itemDetail(items[1], 2)
				};
				itemDetail[] secondItemDetails= {
						new itemDetail(items[2], 2),
						new itemDetail(items[3],3)
				};
				return new Order[] {
						new Order(customers[0], firstItemDetails, LocalDateTime.of(2022, 5, 5, 10, 10)),
						new Order(customers[1], secondItemDetails, LocalDateTime.of(2022, 5, 6, 9, 10))
						
				};
	}
}
