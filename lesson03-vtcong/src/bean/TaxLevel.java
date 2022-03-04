package bean;

public class TaxLevel {
	private Customer customer;
	private Vehicle vehicles;
	private double taxLevel;
	
	public TaxLevel() {
	}

	public TaxLevel(Customer customer, Vehicle vehicles) {
		this.customer = customer;
		this.vehicles = vehicles;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle vehicles) {
		this.vehicles = vehicles;
	}

	public double getTaxLevel() {
		return taxLevel;
	}

	public void setTaxLevel(double taxLevel) {
		this.taxLevel = taxLevel;
	}

	@Override
	public String toString() {
		return "TaxLevel [customer=" + customer + ", vehicles=" + vehicles + ", taxLevel=" + taxLevel + "]";
	}

}
