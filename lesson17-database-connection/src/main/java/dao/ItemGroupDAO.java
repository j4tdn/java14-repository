package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDAO {
	// access default is public abstract in interface
	List<ItemGroup> getAll();
	ItemGroup getItemById(int id);
	void save(ItemGroup itemGroup);
}
