package bean;

import java.util.Objects;

public class Item {
	private Integer itemId;
	private Integer storeId;
	private String name;
	private Double price;

	// constructor empty
	public Item() {
	}

	public Item(Integer itemId, Integer storeId, String name, Double price) {
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
	/*
	 * Câu hỏi: Vì sao cần override lại hàm equals? 
	 * -> Do mặc định lúc compile thì nó sẽ gọi mặc định gọi hàm equals của thèn object
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof Item)) return false;
		
		Item that = (Item)obj;
		
		return getItemId() == that.getItemId() 
			&& getStoreId() == that.getStoreId()
			&& getName().equals(that.getName())
			&& Objects.equals(getPrice(), that.getPrice());
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", storeId=" + storeId + ", name=" + name + ", price=" + price + "]";
	}
	
}
