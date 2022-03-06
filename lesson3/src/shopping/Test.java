package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;
import static shopping.Datamodel.*;
public class Test {
	public static void main(String[] args) {
//		// b1: initial Item, Customer Data
//		Item[] items = inititalItems();
//		Customer[] customers = initialCustomers();
//		itemDetal[] firstItemDetals = {
//				new itemDetal(items[0], 1),
//				new itemDetal(items[1], 2),
//		};
//		itemDetal[] secondItemDetals = {
//				new itemDetal(items[0], 1),
//				new itemDetal(items[1], 2),
//		};
//		// b2 : do Shopping
//		Order[] orders = {
//				new Order(customers[0],firstItemDetals,LocalDateTime.now()),
//				new Order(customers[1], secondItemDetals, LocalDateTime.now()),
//		};
		Item[]items=initialItems();
		Customer[]customers= initialCustomers();
		Order[]orders= createOrder(items, customers);
		
		doCalculate(orders);
		
		System.out.println(Arrays.toString(orders));
		
		// do calculation
		
	}
	private static void doCalculate(Order[] orders) {
		for(Order order:orders) {
			itemDetail [] itemDetails= order.getItemDetals();
			double totalOfMoney=0;
			for(itemDetail itemDetail:itemDetails) {
				Item item= itemDetail.getItem();
				totalOfMoney+=item.getPrice()*itemDetail.getQuantity();
			}
			order.setTotalOfMoney	(totalOfMoney);
		}
	}
}
