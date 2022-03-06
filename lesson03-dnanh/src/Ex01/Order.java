package Ex01;

import java.util.Arrays;

public class Order {
	private Customer customer;
	private VehicleDetail[] vehicleDetail;

	public Order() {
	}

	public Order(Customer customer, VehicleDetail[] vehicleDetail) {
		super();
		this.customer = customer;
		this.vehicleDetail = vehicleDetail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public VehicleDetail[] getVehicleDetail() {
		return vehicleDetail;
	}

	public void setVehicleDetail(VehicleDetail[] vehicleDetail) {
		this.vehicleDetail = vehicleDetail;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", vehicleDetail=" + Arrays.toString(vehicleDetail) + "]";
	}

}
