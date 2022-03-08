package shopping;

import java.time.LocalDateTime;

public class DataModel {
	private DataModel() {
	}
	public static Customer[] initialCustomers() {
		return new Customer[] {
				new Customer("John", "0232512321", true, "Milan"),
				new Customer("Susan", "0231232122", false, "Kiev")	
		};
	}
	public static ItemGroup []initialItemGroups(Item[] items){
		return new ItemGroup[] {
				new ItemGroup("123", "Phone", new Item[] {items[0],items[1]}),
				new ItemGroup("234","Fridfe", new Item[] {items[2]}),
				new ItemGroup("345","Elictric Fan", new Item[] {items[3]}),
				
		};
	}
	
	
	public static Item[] initialItem( ) {
	
		return new Item[] {
				new Item("SS10+","SamSung Galaxy S10+", "Black", 20580.0 ),
				new Item("Iphone8","Iphone 8", "Black", 22600.0),
				new Item("Fridge LG-X12","Fridge LG-X12", "White", 28000.0),
				new Item("EFan 7+","Elictric Fan 7", "Black", 1200.0)
				
		};
}
	public static Order[] createOrder(Item[]items, Customer[]customers) {
		// shopping
				ItemDetail[] firstItemDetails= {
						new ItemDetail(items[0], 1),
						new ItemDetail(items[1], 2)
				};
				ItemDetail[] secondItemDetails= {
						new ItemDetail(items[2], 2),
						new ItemDetail(items[3],3)
				};
				return new Order[] {
						new Order(customers[0], firstItemDetails, LocalDateTime.of(2022, 5, 5, 4, 7,20)),
						new Order(customers[1], secondItemDetails, LocalDateTime.now())
						
				};
	}
}
