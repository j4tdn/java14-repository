package service;

import java.util.List;

import dao.ItemGroupDAO;
import dao.JdbcItemGroupDAO;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService{

	private ItemGroupDAO itemGroupDAO;
	
	public ItemGroupServiceImpl() {
		itemGroupDAO = new JdbcItemGroupDAO();
	}
	
	@Override
	public List<ItemGroup> getAll(){
		return itemGroupDAO.getAll();
	}
	
	@Override
	public ItemGroup getItemById(int id) {
		return itemGroupDAO.getItemById(id);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		if(itemGroupDAO.getItemById(itemGroup.getId()) == null) {
			itemGroupDAO.save(itemGroup);
		} else {
			System.out.println("Item group " + itemGroup.getId() + "is existed ....");
		}
		
	}
	
}
