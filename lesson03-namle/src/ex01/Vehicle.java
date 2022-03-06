

package ex01;

import java.util.Scanner;

public class Vehicle {
	private String carOwner;
	private String rangOfvahicle;
	private int capacity;
	private double price;

	public Vehicle() {
	}

	

	public Vehicle(String carOwner, String rangOfvahicle, int capacity, double price) {
		this.carOwner = carOwner;
		this.rangOfvahicle = rangOfvahicle;
		this.capacity = capacity;
		this.price = price;
	}



	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getRangOfvahicle() {
		return rangOfvahicle;
	}

	public void setRangOfvahicle(String rangOfvahicle) {
		this.rangOfvahicle = rangOfvahicle;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}






	public  void inputVehicle() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the car owner");
		carOwner = input.nextLine();
		System.out.println("enter the car owner");
		rangOfvahicle = input.nextLine();
		System.out.println("enter the capacity");
		capacity = Integer.parseInt(input.nextLine());
		System.out.println("enter the price");
		price = Double.parseDouble(input.nextLine());

	}
	public void outputVehicle() {
		System.out.println(toString());

	}
	public static void doCalculation(Vehicle[] vehicles) {
		for (Vehicle vehicle : vehicles) {

			double totalTax;
			if (vehicle.getCapacity() < 100) {
				totalTax = vehicle.getPrice() * 1 / 100;
				System.out.println("total" + totalTax);
			} else if (vehicle.getCapacity() >= 100 && vehicle.getCapacity() <= 200) {
				totalTax = vehicle.getPrice() * 3 / 100;
				System.out.println("total" + totalTax);
			} else {
				totalTax = vehicle.getPrice() * 5 / 100;
				System.out.println("total" + totalTax);
			}

		}

	}


	@Override
	public String toString() {
		return carOwner + "		"+ rangOfvahicle + "	 "+ capacity + "	 "+ price + "	 "    ;
	}
	

}

