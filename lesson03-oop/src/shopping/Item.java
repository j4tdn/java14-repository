package shopping;

public class Item {
	private String id;
	private String name;
	private String color;
	private double price;
	
	public Item() {
	}

	public Item(String id, String name, String color, double price) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	
	
}
