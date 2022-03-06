package shopping;

public class itemDetail {
	private Item item;
	private int quantity;
	
	public itemDetail() {
		
	}

	public itemDetail(Item item, int quantity) {
		super();
		this.item = item;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "itemDetal [item=" + item + ", quantity=" + quantity + "]";
	}
	
}
