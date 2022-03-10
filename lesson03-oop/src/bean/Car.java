package bean;
//Lombok
public class Car {
	public static String model;
	private String serial;
	private String color;
	private int prime;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String serial, String color) {
		
		this.serial = serial;
		this.color = color;
	}
public Car(String serial, String color,int prime) {
		
		this.serial = serial;
		this.color = color;
		this.prime=prime;
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
	public void setPrime(int prime) {
		this.prime = prime;
	}
	public int getPrime() {
		return prime;
	}
	
	@Override
	public String toString() {
		return serial + "," + color + ","+ prime;
	}
	
	
}
