package shopping;

import static shopping.DataModel.*;

public class ShoppingApp {
	public static void main(String[] args) {
		// perfomance

		// B1: Initial Customer,Item data
		Item[] items = initialItems();
		Customer[] customers = intitialCustomers();

		// B2: Do shopping

		Order[] orders = creatOrder(items, customers);

		// B3: Do calculation
		doCalculation(orders);
		
		System.out.println(orders);
	}

	private static void doCalculation(Order[] orders) {
		for(Order order:orders) {
			//1 order -> n itemDetail ==> totalOfmoney
			
			ItemDetail[] itemDetails = order.getItemDetails();
			if(itemDetails.length > 0 ) {
				double totalOfMoney=0;
			for(ItemDetail itemDetail:itemDetails) {
				Item item = itemDetail.getItem();
				int quantity = itemDetail.getQuantity();
				totalOfMoney+=(item.getPrice()*quantity);
			}
			order.setTotalOfMoney(totalOfMoney);
			}
		}
	}
}
