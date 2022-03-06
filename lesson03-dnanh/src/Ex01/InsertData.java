package Ex01;

public class InsertData {

	
	public InsertData() {
	}
	public static Order[] createOrders(Vehicle[] vehicles, Customer[] customers) {
		VehicleDetail[] firstVehicleDetail = {
				new VehicleDetail(vehicles[0],1),
		};
		VehicleDetail[] secondVehicleDetail = {
				new VehicleDetail(vehicles[1],1),
		};
		VehicleDetail[] thirdVehicleDetail = {
				new VehicleDetail(vehicles[2],1),
		};
		return new Order[] {
				new Order(customers[0],firstVehicleDetail),
				new Order(customers[1],secondVehicleDetail),
				new Order(customers[2],thirdVehicleDetail),
		};
		
		
		
	}
	public static Vehicle[] initialVehicle() {
		return new Vehicle[] {
				new Vehicle("Future Neo",100,35000000,0),
				new Vehicle("Ford Ranger",3000,250000000,0),
				new Vehicle("Landscape",1500,1000000000,0),
				
		};
	}
	public static Customer[] initialCustomer() {
		return new Customer[] {
				new Customer("Nguyen Thu Loan", "012234142", "Da Nang", false),
				new Customer("Le Minh Tinh", "0122323441", "Hue", true),
				new Customer("Nguyen Minh Triet", "012232341", "Quang Nam", false),
		};
	}
}
