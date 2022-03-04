package view;

import bean.Customer;
import bean.TaxLevel;
import bean.Vehicle;

public class DataModel {
	
	private DataModel() {
	}
	
	// Hoa don bao gom thue
	public static TaxLevel[] createTaxLevel(Customer[] customers, Vehicle[] vehicles) {
		return new TaxLevel[] { 
				new TaxLevel(customers[0], vehicles[0]), 
				new TaxLevel(customers[1], vehicles[1]),
				new TaxLevel(customers[2], vehicles[2]),

		};
	}

	// tao danh sach nguoi mua
	public static Customer[] initialCustomer() {
		return new Customer[] { 
				new Customer("Lê Công Huynh", true), 
				new Customer("Lê Minh Tính", false),
				new Customer("Nguyễn Minh Triết", true) };
	}

	// tao database cac loai xe
	public static Vehicle[] initialVehicle() {
		return new Vehicle[] { 
				new Vehicle("CRB 150cc", 150, 50000), 
				new Vehicle("CRB Z1000", 1000, 125000),
				new Vehicle("Ford Ranger", 3000, 250000) };
	}

}
