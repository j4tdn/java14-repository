package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	// Access default is public abstract in interface
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> getItemGroups();
	
	ItemGroup getItemById(int id);
	
	void save(ItemGroup itemGroup);
	
	void update(ItemGroup itemGroup);
	
    List<ItemGroup> search(String name);
}
