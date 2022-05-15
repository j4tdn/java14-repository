package RegisterCar;

public class DataModel {
	public static Vehicle[] initialVehicle() {
    	return new Vehicle[] {
    		new Vehicle("Future Neo", 100, 35000000),
    		new Vehicle("For Ranger", 3000, 250000000),
    		new Vehicle("Lanscape", 1500, 100000000),
    	};
    }
	 public static OwnerCar[] initialOwnerCar() {
	    	return new OwnerCar[] {
	    		new OwnerCar("Nguyen Thu Loan", "034856421", false, "Milan"),
	    		new OwnerCar("Le Minh Tinh", "09856214", true, "Ha Noi"),
	    		new OwnerCar("Nguyen Minh Triet", "03485584", true, "Da Nang"),
	    	};
	}
}
