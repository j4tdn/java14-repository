package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

import static shopping.DataModel.*;

public class ShoppingApp {
	public static void main(String[] args) {
		
		Item[]items=initialItems();
		Customer[]customers= initialCustomers();
		Order[]orders= createOrder(items, customers);
		
		doCalculate(orders);
		
		System.out.println(Arrays.toString(orders));
		
		// do calculation
		
		
		
	}
	private static void doCalculate(Order[] orders) {
		for(Order order:orders) {
			ItemDetail [] itemDetails= order.getItemDetails();
			double totalOfMoney=0;
			for(ItemDetail itemDetail:itemDetails) {
				Item item= itemDetail.getItem();
				totalOfMoney+=item.getPrice()*itemDetail.getQuantity();
			}
			order.setTotalOfMoney(totalOfMoney);
		}
	}
	
	
}
