package shopping;

import java.time.LocalDate;

public class ShoppingUtils {
	private ShoppingUtils() {

	}

	public static void export(Order[] orders, LocalDate promotionDate) {
		for (Order order : orders) {
			System.out.println("\n\nCustomer: " + order.getCustomer().getName());
			ItemDetail[] itemDetails = order.getItemDetails();
			double totalOfMoney = 0;
			for (ItemDetail itemDetail : itemDetails) {

				Item item = itemDetail.getItem();
				System.out.println(item.getName() + ", " + item.getPrice() + ", " + itemDetail.getQuantity());

				double actualPrice = item.getPrice() * itemDetail.getQuantity();
				if (order.getDateCreated().toLocalDate().isEqual(promotionDate) && item.getPrice() > 590) {
					actualPrice *= 0.9;
				}
				totalOfMoney += actualPrice;

			}
			System.out.println(totalOfMoney);
			System.out.println("================================");
			order.setTotalOfMoney(totalOfMoney);
		}
	}
}
