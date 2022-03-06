package view;

import bean.Vehicle;

public class Ex01TaxCalculationApp {

	public static void main(String[] args) {
		Vehicle[] vehicles = initialVehicles();
		taxCalculate(vehicles);
		System.out.printf("%-20s%-20s%20s%20s%20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		System.out.println(
				"====================================================================================================");

		for (Vehicle vehicle : vehicles) {
			System.out.printf("%-20s%-20s%20s%20.2f%20.2f\n", vehicle.getOwnerName(), vehicle.getModel(),
					vehicle.getTankCapacity(), vehicle.getPrice(), vehicle.getTax());
		}
	}

	public static Vehicle[] initialVehicles() {
		return new Vehicle[] { new Vehicle("Future Neo", 35000000, 100, "Nguyễn Thu Loan"),
				new Vehicle("Ford Ranger", 250000000, 3000, "Lê Minh Tính"),
				new Vehicle("Landscape", 1000000000, 1500, "Nguyễn Minh Triết") };
	}

	public static void taxCalculate(Vehicle[] vehicles) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getTankCapacity() < 100) {
				vehicle.setTax(vehicle.getPrice() * 0.01);
			} else if (vehicle.getTankCapacity() <= 200) {
				vehicle.setTax(vehicle.getPrice() * 0.03);
			} else {
				vehicle.setTax(vehicle.getPrice() * 0.05);
			}
		}
	}
}
