package Ex01;

public class Vehicle {
	private String id;
	private int capacity;
	private double price;
	private double tax;
	public Vehicle() {
	}
	public Vehicle(String id, int capacity, double price, double tax) {
		this.id = id;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", capacity=" + capacity + ", price=" + price + ", tax=" + tax + "]";
	}
	
}
