package shopping;

import static shopping.DataModel.*;

public class ShoppingApp {
	public static void main(String[] args) {
		
		// Class ==> static
		// Object ==> non-static, static(not-prefer)
		
		// B1: Initial Item, Customer Data
		Item[] items = initialItems();
		Customer[] customers = initialCustomers();
		
		
		// B2: Do shopping
		Order[] orders = createOrders(items, customers);
		
		// B3: Do calculation
		doCalculation(orders);
		
		System.out.println(orders);
	}
	
	
	private static void doCalculation(Order[] orders) {
		for(Order order: orders) {
			// 1 order -> n item details -> totalOfMoney
			ItemDetail[] itemDetails = order.getItemDetails();
			if (itemDetails.length > 0) {
				double totalOfMoney = 0;
				for (ItemDetail itemDetail: itemDetails) {
					Item item = itemDetail.getItem();
					int quantity = itemDetail.getQuantity();
					totalOfMoney += (item.getPrice() * quantity);
				}
				order.setTotalOfMoney(totalOfMoney);
			}
			
		}
	}
	
}
