package shopping;
import java.time.LocalDate;
import java.time.LocalDateTime;
import shopping.Datamodel.*;
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
		// do calculation
		ShopUtils.export(orders,LocalDate.of(2022, 5, 5));
		System.out.println("===========================");
		//Find items in "Phone" group which have price greater than 200000
		ItemGroup[] itemGroups = initialItemGroups(items);
		for(ItemGroup itemGroup : itemGroups) {
			if(itemGroup.getName().equals("Phone")) {
				Item[] currentItems = itemGroup.getItem();
				for(Item item:currentItems) {
					if(item.getPrice() > 20000)
					System.out.println(item);
				}
			}
		}
	}
	
}
