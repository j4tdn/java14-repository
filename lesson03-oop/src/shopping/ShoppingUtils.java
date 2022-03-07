package shopping;

import java.time.LocalDate;

public class ShoppingUtils {
	
	private ShoppingUtils() {
	}
	
	public static void export(Order[] orders, LocalDate promotionDate) {
		for (Order order : orders) {
			System.out.println("Customer: "+ order.getCustomer().getName());
			ItemDetail[] itemDetails = order.getItemDetail();
			if (itemDetails.length > 0) {
				double totalOfMoney = 0;
				for (ItemDetail itemDetail : itemDetails) {
					Item item = itemDetail.getItem();
					int quantity = itemDetail.getQuantity();
					System.out.println(item.getName()+", "+item.getPrice()+", "+item.getColor());
					double actualPrice = item.getPrice() * quantity;
					if(order.getDateCreated().toLocalDate().isEqual(promotionDate)&&item.getPrice()>590) {
						actualPrice *= 0.9;
					}
					totalOfMoney += actualPrice;
				}
				order.setTotalOfMoney(totalOfMoney);
				System.out.println("=================");
				System.out.println("Total of money: "+ totalOfMoney);
			}
		}
	}
}
