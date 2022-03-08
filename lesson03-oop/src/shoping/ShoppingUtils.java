package shoping;

import java.time.LocalDate;

public class ShoppingUtils {
private ShoppingUtils() {
	// TODO Auto-generated constructor stub
}
//1 order -> n item details -> totalOfMoney
	public static void export (Oder[] oders, LocalDate promtionDate) {
		for(Oder oder : oders) {
			System.out.println("Customer: " + oder.getCustomer().getName());
			ItemDetail[] itemDetails = oder.getItemDetails();
			if(itemDetails.length>0) {
			double totalOfMoney = 0;
			for(ItemDetail itemDetail : itemDetails) {
				Item item = itemDetail.getItem();
				int quantity = itemDetail.getQuantity();
				System.out.println(item.getName() + " , " + item.getPrice() + " , " + quantity );
				double actualPrice = item.getPrice() * quantity;
				//isEqual so sánh bằng với ngày mua
				if(oder.getDateCreated().toLocalDate().isEqual(promtionDate)
						&& item.getPrice() > 590) {
					actualPrice *= 0.9;
				}
				totalOfMoney = actualPrice; 
			}
			oder.setDoCalculation(totalOfMoney);
			System.out.println("--------------------------------------");
			System.out.println("Total of Money " + totalOfMoney);
			System.out.println("======================================");
			//System.out.println("\n");
			}
			}
	}
	
	
}
