package shopping;

import static shopping.DataModel.*;

import java.util.Arrays;

public class ShoppingApp {

	public static void main(String[] args) {

		// Class ==> static
		// Object ==> non-static, static(not-prefer)

		// B1: Initial Customer Data
		Item[] items = initialItems();
		Customer[] customers = initialCustomer();

		// B2 Do shopping
		Order[] orders = createOrders(items, customers);

		// B3
		doCalculation(orders);
		System.out.println(Arrays.toString(orders));
	}

	private static void doCalculation(Order[] orders) {
		double sum = 0;
		for (Order order : orders) {
			ItemDetail[] itemDetails = order.getItemDetail();
			if (itemDetails.length > 0) {
				double totalOfMoney = 0;
				for (ItemDetail itemDetail : itemDetails) {
					Item item = itemDetail.getItem();
					int quantity = itemDetail.getQuantity();
					totalOfMoney += item.getPrice() * quantity;
				}
				order.setTotalOfMoney(totalOfMoney);
			}
			sum += order.getTotalOfMoney();
		}
		System.out.println("Total charge of shopping: " + sum);
	}

}
