package structure;

// custom data type: storeId, itemId, name,price
public class Item {
	// attribute
	//info, values of each object
	public int storeId;
	public int itemId;
	public String name;
	public double price;
	// constructor
	// be called via 'new' keyword
	// init an object contains (storeId, itemId, name,price) and store heap
	public Item() {
	}
	// Item itemA= new Item(101, 22, "IPhoneX",1000)
	public Item(int storeId, int itemId, String name, double price) {
		this.storeId = storeId;
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}
	// itemA.show() >> this = itemA
		// itemB.show() >> this = itemB
		// this: special object to know who is calling this method
		public void show() {
			System.out.println(this.storeId + ", " + this.itemId + ", " + this.name + ", " + this.price);
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return storeId+", "+itemId+", "+name+", "+price;
	}
	
}
