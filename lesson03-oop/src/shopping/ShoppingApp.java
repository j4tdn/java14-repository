package shopping;

import static shopping.DataModel.*;

import java.util.Arrays;

public class ShoppingApp {
	public static void main(String[] args) {
		
		//B1: Initial Item,Customer Data
		Item[] items = initItems();
		Customer[] customers = initialCustomers();
		
		//B2 : Do Shopping
		Order[] orders = createOrders(items, customers);
		
		//B3 : Xuat Don Hang
		doCalMoneyOrder(orders);
		System.out.print(Arrays.toString(orders));
		
		
	}
	//tinh tong tien so luong item
	private static void doCalMoneyOrder(Order[] orders) {
		//lay so luong cac item
		for(Order order:orders) {
			ItemDetail[] itemDetails = order.getItemDetails();
			double totalMoney=0;
			//tinh so tien tung item
			for(ItemDetail itemDetail : itemDetails) {
				Item item = itemDetail.getItem();
				totalMoney+= (item.getPrice()*itemDetail.getQuantity());
			}
			
			order.setTotalMoney(totalMoney);
		}
	}
	

}
