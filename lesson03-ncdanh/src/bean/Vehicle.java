package bean;

public class Vehicle {
	private String model;
	private double price;
	private  int tankCapacity;
	private String ownerName;
	private double tax;
	
	public Vehicle() {
	}

	public Vehicle(String model, double price, int tankCapacity, String ownerName) {
		this.model = model;
		this.price = price;
		this.tankCapacity = tankCapacity;
		this.ownerName = ownerName;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", price=" + price + ", tankCapacity=" + tankCapacity + ", ownerName="
				+ ownerName + "]";
	}

	
}
