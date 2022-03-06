package registercar;

public class RegistingApp {
    public static void main(String[] args) {
		Vehicle[] vehicles = initialVehicle();
		Owner[] owners = initialOwner();
		
		RegisterCar[] registerCars = {
			new RegisterCar(owners[0], vehicles[0]),
			new RegisterCar(owners[1], vehicles[1]),
			new RegisterCar(owners[2], vehicles[2])
		};
		output(registerCars);
	}
    public static void output(RegisterCar[] registers) {
    	System.out.printf("%30s %20s %10s %20s %20s", "Ten chu xe", "Loai xe", "dung tich", "tri gia", "Thue phai nop");
    	System.out.println("\n====================================================================================================================");
    	for(RegisterCar register: registers) {
    		System.out.printf("%30s %20s %10.0f %20.2f %20.2f", register.getOwner().getName(), register.getVehicle().getModel(), register.getVehicle().getCapacity(), register.getVehicle().getPrice(), register.getVehicle().getTax() );
    		System.out.println("\n");
    	}
    }
    private static Vehicle[] initialVehicle() {
    	return new Vehicle[] {
    		new Vehicle("Future Neo", 100, 35000000),
    		new Vehicle("For Ranger", 3000, 250000000),
    		new Vehicle("Lanscape", 1500, 100000000)
    	};
    }
    private static Owner[] initialOwner() {
    	return new Owner[] {
    		new Owner("Nguyen Thu Loan", "034856421", false, "Milan"),
    		new Owner("Le Minh Tinh", "09856214", true, "Ha Noi"),
    		new Owner("Nguyen Minh Triet", "03485584", true, "Da Nang"),
    	};
    }
}
