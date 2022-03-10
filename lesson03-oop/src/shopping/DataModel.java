package shopping;

import java.time.LocalDateTime;

public class DataModel {
	
	private DataModel() {
		
	}
	public static Order[] creatOrder(Item[] items,Customer[] customers) {
		ItemDetail[] firstitemDetails= {
				new ItemDetail(items[0],1),
				new ItemDetail(items[0],2),
		};
		ItemDetail[] seconditemDetails= {
				new ItemDetail(items[0],1),
				new ItemDetail(items[0],2),
		};
		ItemDetail[] thirditemDetails= {
				new ItemDetail(items[0],1),
				new ItemDetail(items[0],2),
		};
		
		return new Order[] {
			new Order(customers[0],firstitemDetails,LocalDateTime.now()),
			new Order(customers[0],seconditemDetails,LocalDateTime.now())
		};
	}
	public static Item[] initialItems() {
		return new Item[] {
			new Item("SS10+","SamSung","Yellow",294721),	
			new Item("Ip10+","SamSung","Yellow",303721),	
			new Item("Nokia+","LG","Yellow",33721),	
			new Item("Fridge","LG","Yellow",12321)	
		};
	}
	
	public static Customer[] intitialCustomers() {
		return new Customer[] { new Customer("John", "0332323323", true, "Roma"),
				new Customer("Susan", "035433423", false, "Kiev")

		};
	}
}
