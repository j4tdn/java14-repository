package shopping;

public class Item {
	private String id;
	private String name;
	private String color;
	private Double price;
	private ItemGroup itemGroup;
	public Item() {
	}
	public Item(String id, String name, String color, Double price, ItemGroup itemGroup) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.itemGroup=itemGroup;
	}
	public Item(String id, String name, String color, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public ItemGroup getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
}
