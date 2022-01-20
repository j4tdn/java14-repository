package structure;

// custom data type: storeId, Itemid, name, price
// object type is a wrapper
public class Item {
	// attribute
	public int storeId;
	public int itemId;
	public String name;
	public double price;

	// constructor
	// be called via 'new' keyword
	// initiate an object
	public Item(int inputStoreId, int inputItemId, String inputName, double inputPrice) {
		storeId = inputStoreId;
		itemId = inputItemId;
		name = inputName;
		price = inputPrice;

	}

	public void show() {
		System.out.println(storeId + ", " + itemId + ", " + name + ", " + price);
	}

	@Override
	public String toString() {

		return this.storeId + ", " + this.itemId + ", " + this.name + ", " + this.price;
	}
}
