package RegisterCar;
public class rigisterCar {
	 private OwnerCar ownerCar;
	 private Vehicle vehicle;
	
	 public rigisterCar() {
	 }

	 public rigisterCar(OwnerCar ownerCar, Vehicle vehicle) {
		this.ownerCar = ownerCar;
		this.vehicle = vehicle;
	 }

	public OwnerCar getOwnerCar() {
		return ownerCar;
	}

	public void setOwnerCar(OwnerCar ownerCar) {
		this.ownerCar = ownerCar;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "RigisterCar [ownerCar=" + ownerCar + ", vehicle=" + vehicle + "]";
	}
	 
	 
	
	 
}
