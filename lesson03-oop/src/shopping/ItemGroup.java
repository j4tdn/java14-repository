package shopping;

import java.util.Arrays;

public class ItemGroup {
	private int id ;
	private String name;
	private Item[] items;
	
	public ItemGroup() {
	}

	public ItemGroup(int id, String name, Item[] item) {
		this.id = id;
		this.name = name;
		this.items = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item[] getItem() {
		return items;
	}

	public void setItem(Item[] item) {
		this.items = item;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", item=" + Arrays.toString(items) + "]";
	}
	
	
	
	
}
