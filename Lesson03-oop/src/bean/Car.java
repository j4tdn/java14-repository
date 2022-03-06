package bean;

public class Car {

	private String serial;
	public static String model;
	private String color;
	private double price ;
	

	public Car() {
		super();
	}

	public Car(String serial, String color) {
		this.serial = serial;
		this.color = color;
	}
	
	public Car(String serial, String color, double price) {
		this.serial = serial;
		this.color = color;
		this.price = price;
	}
	
	// Car c1 = new Car("car 1", "Model 1", "Red");
	
	
	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return serial + "," + model + "," + color;  
	}

}
