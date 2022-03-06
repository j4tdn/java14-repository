package registercar;

import java.util.Arrays;

public class RegisterCar {
    private Owner owner;
    private Vehicle vehicle;
    
    public RegisterCar() {
	}
    public RegisterCar(Owner owner, Vehicle vehicle) {
    	this.owner = owner;
    	this.vehicle = vehicle;
    }
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "" + owner.getName() + "\t" + vehicle;
	}
	
    
}
