package bean;

import java.util.Objects;

public class Item {
	private Integer itemId;
	private Integer storeId;
	private String name;
	private Double price;
	public Item() {
	}
	public Item(Integer itemId, Integer storeId, String name, Double price) {
		super();
		this.itemId = itemId;
		this.storeId = storeId;
		this.name = name;
		this.price = price;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getItemId(),getStoreId(),getName(),getPrice());
	}
	@Override
	public boolean equals(Object o) {
		if(this == o ) return true;
		if(!(o instanceof Item)) return false;
		Item that= (Item) o;
		
		return getItemId() == that.getItemId()
			   && getStoreId() == that.getStoreId()
			   && getName().equals(that.getName())
			   && getPrice().doubleValue()== that.getPrice().doubleValue();
		// Objects.equals(getPrice(),that.getPrice());
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", storeId=" + storeId + ", name=" + name + ", price=" + price + "]";
	}
	
}
