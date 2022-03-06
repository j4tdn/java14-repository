package Ex01;

import static Ex01.InsertData.*;

public class App {
	public static void main(String[] args) {
		// initial data
		Vehicle[] vehicles = initialVehicle();
		Customer[] cutCustomers = initialCustomer();
		// shopping
		Order[] orders = createOrders(vehicles, cutCustomers);
		registrationTaxCalculation(orders);

	}

	private static void registrationTaxCalculation(Order[] orders) {
		double currentTax = 0;

		for (Order order : orders) {
			VehicleDetail[] vehicleDetails = order.getVehicleDetail();
			if (vehicleDetails.length > 0) {

				for (VehicleDetail vehicleDetail : vehicleDetails) {
					Vehicle vehicle = vehicleDetail.getVehicle();

					if (vehicle.getCapacity() < 100) {
						currentTax = vehicle.getPrice() * 0.01;
					} else if (vehicle.getCapacity() < 200) {
						currentTax = vehicle.getPrice() * 0.03;
					} else {
						currentTax = vehicle.getPrice() * 0.05;
					}
					vehicle.setTax(currentTax);
					System.out.println(order.getCustomer().getName() + "  " + vehicle.getId() + " "
							+ vehicle.getCapacity() + " " + vehicle.getPrice() + " " + vehicle.getTax());
				}

			}
		}
	}

}
