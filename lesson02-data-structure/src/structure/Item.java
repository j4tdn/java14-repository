package structure;


public class Item {

	public int storeId;
	public int itemId;
	public String name;
	public double price;
	

	public Item(int ipStoreId, int ipItemId, String ipName, double ipPrice) {
		storeId = ipStoreId;
		itemId = ipItemId;
		name = ipName;
		price = ipPrice;
	}
	public void show() {
		System.out.println(this.storeId + ", " + this.itemId + ", " + this.name + ", " + this.price);
	}
	
	@Override
	public String toString() {
		return this.storeId + ", " + this.itemId + ", " + this.name + ", " + this.price;
	}
}