package shopping;

import java.util.Arrays;

public class ItemGroup {
	private String id;
	private String name;
	private Item[] items;
	
	public ItemGroup(String id, String name, Item[] items) {
		this.id = id;
		this.name = name;
		this.items = items;
	}

	public String getId() {
		return id;
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
		return items;
	}

	public void setItem(Item[] item) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", item=" + Arrays.toString(items) + "]";
	}
	
	
}
