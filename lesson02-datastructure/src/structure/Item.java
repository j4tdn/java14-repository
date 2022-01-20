package structure;

//Custom data type storeId, itemId, name, price
public class Item {
	//attribute
	public int storeId;
	public int itemId;
	public String name;
	public double price;
	
	//Constructor -> được gọi thông qua từ khóa new
	
	// be called via 'new' keyword
		// init an object contains (storeId, itemId, name, price) and store in heap
		// Item itemA = new Item(101, 22, 'IPhone X', 1000);
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
