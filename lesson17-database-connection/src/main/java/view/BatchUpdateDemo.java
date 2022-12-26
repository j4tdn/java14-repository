package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class BatchUpdateDemo {
	
	private static final String PATH = "LoaiHang.txt";
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) throws IOException {
//		List<ItemGroup> itemGroups = readFile();
//		itemGroupService.save(itemGroups);
		
	}

	
	/*
	    69000, Item Group 69000
		69001, Item Group 69001
		69002, Item Group 69002
		69003, Item Group 69003
		69004, Item Group 69004
		69005, Item Group 69005
		69006, Item Group 69006
		69007, Item Group 69007
		69008, Item Group 69008
		69009, Item Group 69009
	 */
	
	private static List<ItemGroup> readFile() {
		try {
			return Files.readAllLines(
					new File(PATH).toPath())
				        .stream()
				        .map(ItemGroup::new)
				        .collect(Collectors.toList());
		} catch (IOException exception) {
			exception.printStackTrace();	
		}
			return Collections.emptyList(); 
	}
}
