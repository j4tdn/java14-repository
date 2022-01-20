package structure;

public class Item {
	public int storeID;
	public int itemID ;
	public String name  ;
	public double price ;
	public static void main(String[] args) {
		
	}
	public Item(int ipStoreID, int ipItemId, String ipName, double ipPrice) {
		storeID = ipStoreID;
		itemID = ipItemId;
		name = ipName ;
		price = ipPrice;
	}
	public void show() {
		System.out.println(this.storeID + ", " + this.itemID + " , " + this.name + " , " + this.price);
	}
	public String toString() {
		return this.storeID + ", " + this.itemID + " , " + this.name + " , " + this.price; 
	}
}