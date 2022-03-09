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
				new Order(customers[0], firstItemDetails, LocalDateTime.of(2022, 5, 5, 16, 10)),
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
	
	
	public static ItemGroup[] initialItemGroup(Item[] items) {
		
		return new ItemGroup[] {
				new ItemGroup(1, "phone", new Item[] {items[0],items[1]}),
				new ItemGroup(2, "Fridge", new Item[] {items[2]}),
				new ItemGroup(3, "Electric Fan", new Item[] {items[3]})
				
		};
	}
	
}
