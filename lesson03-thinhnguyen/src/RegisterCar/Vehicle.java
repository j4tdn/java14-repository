package RegisterCar;

public class Vehicle {
	private String model;
	private double capacity;
	private double price;
	private double tax;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String model, double capacity, double price) {
		this.model = model;
		this.capacity = capacity;
		this.price = price;
		if(price < 100 ) {
    		this.tax = price * 0.01;
    	} else if (price <= 200) {
    		this.tax = price * 0.03;
    	} else {
    		this.tax = price * 0.05;
    	}
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
		return "Vehicle [model=" + model + ", capacity=" + capacity + ", price=" + price + ", tax=" + tax + "]";
	}

}
