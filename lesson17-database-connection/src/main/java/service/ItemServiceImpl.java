package service;

import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService{
	
	private ItemDao itemDAO;
	
	public ItemServiceImpl() {
		itemDAO = new JdbcItemDao();
	}
	
	@Override
	public List<Item> getItems(String itemGroupName) {
		Objects.requireNonNull(itemGroupName, "itemGroupName cannot be null");
		return itemDAO.getItems(itemGroupName);
	}
}
