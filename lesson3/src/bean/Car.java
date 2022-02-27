package bean;

// tim hieu Lombok

public class Car {
	public static String model;
	
	private String serial;
	private String color;

	public Car() {
		
	}
	public Car(String serial, String color) {
		this.serial = serial;
		this.color = color;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return  serial + ", " + color + ", " + model;
	}
}
