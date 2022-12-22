package view;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	private static ItemGroupService itemGroupService; // compile
	
	static {
		itemGroupService = new ItemGroupServiceImpl(); // runtime
	}
	
	public static void main(String[] args) {
		
		System.out.println("--------------1. Get all itemGroups--------------");
		List<ItemGroup> GET_ALL_ITS = itemGroupService.getAll();
		GET_ALL_ITS.forEach(System.out::println);
		System.out.println("\n\n");
		
		System.out.println("--------------2. Save or update--------------");
		itemGroupService.saveOrUpdate(new ItemGroup(2222, "Item Group 2222"));
		System.out.println("\n\n");
		
		System.out.println("--------------3. Get itemGroup by id--------------");
		ItemGroup GET_ITS_BY_ID = itemGroupService.getItemById(2222);
		System.out.println("Get item group by id " + GET_ITS_BY_ID);
		System.out.println("\n\n");
		
		System.out.println("--------------4. Search itemGroups by name--------------");
		List<ItemGroup> SEARCH_IGS_BY_NAME = itemGroupService.search("Thắt lưng");
		SEARCH_IGS_BY_NAME.forEach(System.out::println);
		System.out.println("\n\n");
		
		System.out.println("--------------5. SQL injection--------------");
		String sqlInjection = "...' OR '1=1";
		List<ItemGroup> SQLInjection = itemGroupService.search(sqlInjection);
		SQLInjection.forEach(System.out::println);
		System.out.println("\n\n");
		
		System.out.println("--------------6. Get itemGroups Details");
		itemGroupService.getItemGroupDetails().forEach(System.out::println);
		System.out.println("\n\n");
		
		System.out.println("--------------7. Get IG-DTO(s)--------------");
		itemGroupService.getItemGroups().forEach(System.out::println);
		System.out.println("\n\n");
		

	}
}
 