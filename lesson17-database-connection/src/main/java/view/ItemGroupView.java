package view;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		itemGroupService.save(new ItemGroup(2222, "Item 2222"));
		
		//List<ItemGroup> GET_ALL_ITS = itemGroupService.getAll();
		ItemGroup GET_ITS_BY_ID = itemGroupService.getItemById(2222);
		
		//GET_ALL_ITS.forEach(System.out::println);
		System.out.println("Get item by id " + GET_ITS_BY_ID);
		

	}
}
