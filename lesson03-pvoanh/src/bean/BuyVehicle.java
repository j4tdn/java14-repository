package bean;

public class BuyVehicle {
	private String nameOfOwner;
	private Vehicle vehicle;
	
	private double tax;
	public BuyVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BuyVehicle(String nameOfOwner, Vehicle vehicle, double tax) {
		super();
		this.nameOfOwner = nameOfOwner;
		this.vehicle = vehicle;
		this.tax = tax;
	}
	public BuyVehicle(String nameOfOwner, Vehicle vehicle) {
		super();
		this.nameOfOwner = nameOfOwner;
		this.vehicle = vehicle;
		
	}
	public String getNameOfOwner() {
		return nameOfOwner;
	}
	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "BuyVehicle [nameOfOwner=" + nameOfOwner + ", vehicle=" + vehicle + ", tax=" + tax + "]";
	}
	
	
	
	
}
