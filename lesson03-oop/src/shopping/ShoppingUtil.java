package shopping;

import java.time.LocalDate;

public class ShoppingUtil {

	private ShoppingUtil() {

	}

	// tinh tong tien so luong item
	public static void export(Order[] orders, LocalDate promotionDay) {
		// lay so luong cac item
		for (Order order : orders) {
			System.out.println("Customer:" + order.getCustomer().getName());
			ItemDetail[] itemDetails = order.getItemDetails();
			if (itemDetails.length > 0) {
				double totalOfMoney = 0;
				System.out.println("=============================");
				// tinh so tien tung item
				for (ItemDetail itemDetail : itemDetails) {
					Item item = itemDetail.getItem();
					double quantity = itemDetail.getQuantity();
					System.out.println(item.getName() + "," + item.getPrice() + "," + quantity);

					double salePrice = item.getPrice() * quantity;

					// LocalDatetime.toLocaldate => lay ra ngay thang nam.
					if (order.getDateCreated().toLocalDate().isEqual(promotionDay) && item.getPrice() > 590) {
						salePrice *= 0.9;
					}

					totalOfMoney += salePrice;
				}
				order.setTotalMoney(totalOfMoney);
				System.out.println("=============================");
				System.out.println("Total of money: " + totalOfMoney);
				System.out.println("\n\n");

			}
		}
	}

//	public static Item[] findItems(ItemGroup[] itemGroups, int price,String loaihang) {
//		Item[] itemphone = new Item[itemGroups.length];
//		int count=0;
//		for (ItemGroup itemGroup : itemGroups) {
//			String nameItemGroup = itemGroup.getName();
//			if (nameItemGroup.equals(loaihang)) {
//				Item[] curentItems = itemGroup.getItem();
//				for (Item item : curentItems) {
//					if (item.getPrice() > price) {
//						itemphone[count++] = new Item(String.valueOf(count), item.getName(), item.getColor(), item.getPrice());
//						//System.out.println(item);
//					}
//				}
//			}
//		}
//		return itemphone;
//	}

}
