package shopping;

import java.util.Arrays;

public class ItemGroup {
	private String id;
	private String name;
	private Item[] item;
	public ItemGroup() {
	}
	public String getId() {
		return id;
	}
	
	public ItemGroup(String id, String name, Item[] item) {

		this.id = id;
		this.name = name;
		this.item = item;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item[] item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", item=" + Arrays.toString(item) + "]";
	}
	
	
	
}
