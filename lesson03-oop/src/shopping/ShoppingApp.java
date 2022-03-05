package shopping;

import static shopping.DataModel.*;

public class ShoppingApp {
	public static void main(String[] args) {
		// B1: Initial Customer Data

		Item[] items = initialItem();
		Customer[] customers = initialCustomer();

		// B2: Do shopping
		Order[] orders = DataModel.createOrders(items, customers);

		// B3: Do calculation

	}

	private static void doCalculation(Order[] orders) {
		for (Order order : orders) {
			// 1 order -> n item details --> totalOfMoney

			ItemDetail[] itemDetails = order.getItemDetails();
			if (itemDetails.length > 0) {
				double totalOfMoney = 0;

				for (ItemDetail itemDetail : itemDetails) {
					Item item = itemDetail.getItem();
					int quanlity = itemDetail.getQuanlity();
					totalOfMoney += (item.getPrice() * quanlity);
				}
				order.setTotalOfMoney(totalOfMoney);
			}
		}
	}
}
