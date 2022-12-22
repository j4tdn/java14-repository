package view;

import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("--------------Get items by item group name--------------");
		itemService.getItems("Mũ").forEach(System.out::println);
	}
}
