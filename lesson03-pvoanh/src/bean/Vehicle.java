package bean;

public class Vehicle {
	private String type;
	private int capacity;
	private double price;
	
	public Vehicle(String type, int capacity, double price) {
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", capacity=" + capacity + ", price=" + price + "]";
	}
	
}
