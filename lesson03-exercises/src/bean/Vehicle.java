package bean;

public class Vehicle {
	private String nameOfOwner;
	private String typeOfVehicle;
	private int capacity;
	private double price;


	public Vehicle() {
	}

	public Vehicle(String nameOfOwner, String typeOfVehicle, int capacity, double price) {
		this.nameOfOwner = nameOfOwner;
		this.typeOfVehicle = typeOfVehicle;
		this.capacity = capacity;
		this.price = price;
	
	}

	public String getNameOfOwner() {
		return nameOfOwner;
	}

	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
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
		return "Vehicle [nameOfOwner=" + nameOfOwner + ", typeOfVehicle=" + typeOfVehicle + ", capacity=" + capacity
				+ ", price=" + price +  "]";
	}
	

}
