package shopping;

public class ItemGroup {
	private String itemGroupId;
	private String name;
	private Item[] items;
	public ItemGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemGroup(String itemGroupId, String name, Item[] items) {
		super();
		this.itemGroupId = itemGroupId;
		this.name = name;
		this.items = items;
	}
	public String getItemGroupId() {
		return itemGroupId;
	}
	public void setItemGroupId(String itemGroupId) {
		this.itemGroupId = itemGroupId;
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
