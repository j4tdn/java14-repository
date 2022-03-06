package structure;

// Custom data type: storeId, itemId, name, price
// object type is wrapper 
// default extend Object
// using Object;s method
public class Item {
    // attribute
	// info , values of each object 
	public int storeId;
	public int itemId;
	public String name;
	public double price;
    
	// constructor
	// be called via 'new' keyword
	// create an object contains (storeId, itemId, name, price)
	// Item itemA = new Item(101, 22, "IPhone X", 1000);
	public Item(int ipStoreId, int ipItemId, String ipName, double ipPrice ) {

		storeId = ipStoreId;
		itemId = ipItemId;
		name = ipName;
		price = ipPrice;
		
	}
	public void show() {
		System.out.println(this.storeId + " , " + this.itemId + " , " + this.name + " , " + this.price );
	}
	@Override
	public String toString() {		
		return (this.storeId + " , " + this.itemId + " , " + this.name + " , " + this.price );
	}
	
}
