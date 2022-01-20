package structure;

// custom data type: storeId, itemId, name, price
// object type is a wrapper
public class Item {
    // attribute
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
// itemA.show() >> this = itemA
	// itemB.show() >> this = itemB
	// this: special object to know who is calling this method
	public void show() {
		System.out.println(this.storeId + ", " + this.itemId + ", " + this.name + ", " + this.price);
	}
	
	@Override
	public String toString() {
		return this.storeId + ", " + this.itemId + ", " + this.name + ", " + this.price;
	}
}
