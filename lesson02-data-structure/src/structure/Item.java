package structure;

public class Item {
	public String name;
	public double price;
	private int storeId;
	private Object itemId;
	
	public Item(int ipStoreID, int ipItemID, String ipName, double ipPrice) {
		storeId = ipStoreID;
		itemId = ipItemID;
		name = ipName;
		price = ipPrice;
	}
	
	public void show () {
		System.out.println(this.storeId + "," + this.itemId + "," + this.name + "," + this.price);
	}
	 public String toString() {
		return this.storeId + "," + this.itemId + "," + this.name + "," + this.price;
		 
	 }
}
