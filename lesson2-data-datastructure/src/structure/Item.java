package structure;


//custom data type: storeId,itemId,name , price
//object type is a wrapper 
//default extend Object
// uisng object's methods
public class Item {
	//attribute
	//info, value of each object
	public int storeId;
	public int itemId;
	public String name;
	public double price;
	//constructor
	// be caller via 'new' keyword
	//init an object contains(storeId, itemId,name,price) add store in heap
	//itemA=new Item(101,22,"Iphone X",100)
	public Item(int ipStoreId, int ipItemId,String ipName,double ipPrice) {
		storeId=ipStoreId;
		itemId=ipItemId;
		name=ipName;
		price=ipPrice;
	}
	public void show() {
		System.out.println(this.storeId + "," + this.itemId + ","+ this.name + "," + this.price + "," );	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.storeId + "," + this.itemId + ","+ this.name + "," + this.price + "," ;
	}
}
