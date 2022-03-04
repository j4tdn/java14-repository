package view;

import java.util.Arrays;
import static view.DataModel.*;

import bean.Customer;
import bean.TaxLevel;
import bean.Vehicle;

public class BuyingVehicle {
	public static void main(String[] args) {

		// Khoi tao gia tri
		Customer[] customers = initialCustomer();
		Vehicle[] vehicles = initialVehicle();

		// Buying vehicle
		TaxLevel[] taxLevels = createTaxLevel(customers, vehicles);

		// Xuat Hoa Don
		doCalOfTax(taxLevels);
		System.out.printf("%-20s%-15s%-15s%-15s%-15s\n", "Tên chủ xe", "Loại Xe", " Dung tích", "Trị Giá",
				"Thuế Phải Nộp");
		System.out.println("======================================================================");
		for (TaxLevel taxlevel : taxLevels) {
			Customer customer = taxlevel.getCustomer();
			Vehicle vehicle = taxlevel.getVehicles();
			System.out.printf("%-20s%-15s%-15s%-15s%-15s\n", customer.getName(), vehicle.getModel(),
					vehicle.getCapacity(), vehicle.getPrice(), taxlevel.getTaxLevel());
		}
	}

	// tinh thue cua cac loai xe
	private static void doCalOfTax(TaxLevel[] taxs) {
		for (TaxLevel tax : taxs) {
			double payerTax = 0;
			Vehicle vehicle = tax.getVehicles();
			int capacity = vehicle.getCapacity();
			if (capacity < 100) {
				payerTax += (capacity / 100);
			}
			if (capacity > 100 && capacity < 200) {
				payerTax += (capacity * 0.03);
			}
			if (capacity > 200) {
				payerTax += (capacity * 0.05);
			}
			tax.setTaxLevel(payerTax);
		}
	}


}
