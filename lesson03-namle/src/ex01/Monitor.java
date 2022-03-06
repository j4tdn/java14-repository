package ex01;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Monitor {

	public static void main(String[] args) {

//		int n = 4;
//		Vehicle vehicle[] = { new Vehicle("Nguyen Thu Lan", "futture neo", 100, 35000000),
//				new Vehicle("Nguyen Mai Phuong", "supper cup", 50, 10000000),
//				new Vehicle("Le Dang Hoai Nam", "BMW", 3000, 250000000),
//				new Vehicle("Le Duc Khoa", "landscape", 1500, 1000000000), };
//
//		outputVehicles(vehicle, n);
//		doCalculation(vehicle);

		Menu();

	}

	private static double doCalculation(Vehicle[] vehicles) {
		double totalTax = 0;
		for (Vehicle vehicle : vehicles) {

			
			if (vehicle.getCapacity() < 100) {
				totalTax = vehicle.getPrice() * 1 / 100;
		
			} else if (vehicle.getCapacity() >= 100 && vehicle.getCapacity() <= 200) {
				totalTax = vehicle.getPrice() * 3 / 100;
			
			} else {
				totalTax = vehicle.getPrice() * 5 / 100;
			
			}
			
		}
		return totalTax;

	}

	public static void outputVehicles(Vehicle vehicles[], int n) {
		System.out.println("Ten Chu Xe"+"\t"+"Loai Xe"+ "\t\t"+"Dung Tich"+"\t"+"Tri Gia"+"\t\t"+"Thue Phai Nop");
		
		for (int i = 0; i < n; i++) {
			vehicles[i].outputVehicle();
			vehicles[i].doCalculation(vehicles);
		}
	}

	public static void Menu() {
	
		
		int n = 0;
		Scanner sc = new Scanner(System.in);
		Vehicle[] vehicles = new Vehicle[n];
		int choose;

		do {
			System.out.println("enter the choose");
			System.out.println("1. input the Vehicle");
			System.out.println("2. vehicle tax information");
			System.out.println("3.exit program");
			
		
			choose = Integer.parseInt(sc.nextLine());
			
			switch (choose) {
			case 1:
				
			
				Scanner input = new Scanner(System.in);
				System.out.println("enter the number of Array");
				n = Integer.parseInt(input.nextLine());
				vehicles = new Vehicle[n];
				
				for (int i = 0; i < n; i++) {
					vehicles[i] = new Vehicle();
					vehicles[i].inputVehicle();
				}
				break;
			case 2:
				
				outputVehicles(vehicles, n);
				break;

			case 3:
				System.out.println("exit succses");
				break;
			default : 
				System.err.println("bug");
			}
			
		} while (choose != 3);

	}

	public void inputVehicles(Vehicle vehicles[], int n) {

		vehicles = new Vehicle[n];
		for (int i = 0; i < n; i++) {
			vehicles[i] = new Vehicle();
			vehicles[i].inputVehicle();
		}
	}

}
