package shopping;

public class ItemGroup {
	private String id;
	private String name;
	private Item[] items;
	
	public ItemGroup() {
	}

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

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	
}
