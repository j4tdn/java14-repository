package shopping;

import java.time.LocalDate;

public class ShopUtils {
	private ShopUtils() {
		
	}
	public static void export(Order[] orders, LocalDate promotionDate) {
		for(Order order:orders) {
			System.out.println("Customer : " + order.getCustomer().getName());
			itemDetail [] itemDetails= order.getItemDetals();
			if(itemDetails.length > 0) {
				double totalOfMoney=0;
				System.out.println("================");
				for(itemDetail itemDetail:itemDetails) {
					Item item= itemDetail.getItem();
					int quanlity = itemDetail.getQuantity();
					System.out.println(item.getName() + ", " + item.getPrice() + ", " + quanlity);
					double actualPrice = item.getPrice() * quanlity;
					if(order.getDateCreated().toLocalDate().isEqual(promotionDate)
							&& item.getPrice() > 590) {
						actualPrice *= 0.9;
					}
					totalOfMoney += actualPrice;
				}
				order.setTotalOfMoney(totalOfMoney);
				System.out.println("========");
				System.out.println("Total of money: " + totalOfMoney);
				System.out.println("\n");
			}	
		}
	}
}
