package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	List<ItemGroupDto> getItemGroups();
	List<ItemGroup> getItemGroupDetails();
	ItemGroup getItemById(int id);
	void saveOrUpdate(ItemGroup itemGroup);
	List<ItemGroup> search(String name);
}
