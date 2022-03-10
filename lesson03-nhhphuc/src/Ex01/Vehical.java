package Ex01;

public class Vehical {
	private String owner;
	private String model;
	private double capacity;
	private double price;
	private double tax;
	
	public Vehical() {
	}
		
	public Vehical(String owner, String model, double capacity, double price) {
		this.owner = owner;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
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
		return "Vehical [owner=" + owner + ", model=" + model + ", capacity=" + capacity + ", price=" + price + ", tax="
				+ tax + "]";
	}

}
