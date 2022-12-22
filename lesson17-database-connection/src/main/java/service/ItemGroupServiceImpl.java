package service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{

	
	private ItemGroupDao itemGroupDAO; 
	private ItemDao itemDAO;
	
	public ItemGroupServiceImpl() {
		itemGroupDAO = new JdbcItemGroupDao();
		itemDAO = new JdbcItemDao();
	}
	
	@Override
	public List<ItemGroup> getAll(){
		return itemGroupDAO.getAll();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroups() {
		return itemGroupDAO.getItemGroups();
	}
	
	@Override
	public List<ItemGroup> getItemGroupDetails() {
		List<Item> items = itemDAO.getAll();
		/*
		 * items
		 * idA1, nameA1, colorA1, itemGroupA
		 * idA2, nameA2, colorA2, itemGroupA
		 * 
		 * idB1, nameB1, colorB1, itemGroupB
		 * idB2, nameB2, colorB2, itemGroupB
		 * 
		 * 
		 * idC1, nameC1, colorC1, itemGroupC
		 * idC2, nameC2, colorC2, itemGroupC
		 * 
		 * ==> itemGroups
		 * itemGroupA, List<Item>
		 * itemGroupB, List<Item>
		 */
		// Entry<Key, Value>
		return items.stream()
			 .collect(Collectors.groupingBy(item -> item.getItemGroup())) // return map<K, V>
			 .entrySet() // return set<entry<K, V>>
			 .stream()   // stream<entry>
			 .map(ItemGroup::new)
			 .collect(Collectors.toList());
	}
	
	@Override
	public ItemGroup getItemById(int id) {
		return itemGroupDAO.getItemById(id);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		// avoid NullPointerException
		if(Optional.ofNullable(itemGroupDAO.getItemById(itemGroup.getId())).isPresent()) {
			System.out.println("ig is existed --> executing update ...");
			itemGroupDAO.update(itemGroup);
		} else {
			System.out.println("ig is not exist --> executing save ...");
			itemGroupDAO.save(itemGroup);
		}
		
	}
	
	@Override
	public List<ItemGroup> search(String name) {
		Objects.requireNonNull(name, "ig name cannot be null");
		return itemGroupDAO.search(name);
	}
	
}
