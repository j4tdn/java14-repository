package view;

import static data.DataVehicle.*;

import java.util.Arrays;

import bean.Vehicle;
import data.DataVehicle;

public class VehicleApp {
	public static void main(String[] args) {
		// 1. Nhập thông tin và tạo N đối tượng xe
		Vehicle[] vehicles = initialVehicle();

		// 2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
		double[] taxs = calculateTax(vehicles);
		System.out.printf("Tên chủ xe \t Loại xe \t Dung tích \t Trị giá \t Thuế phải nộp \n");
		System.out.println("=============================================================================");
		for(int i=0;i<taxs.length;i++) {
			System.out.println(vehicles[i].getNameOfOwner()+" \t "
							+vehicles[i].getTypeOfVehicle()+" \t "
							+vehicles[i].getCapacity()+" \t \t  "
							+vehicles[i].getPrice()+" \t  "+
							+taxs[i]);
		}

	}

	private static double[] calculateTax(Vehicle[] vehicles) {
		double[] taxs = new double[vehicles.length];
		int index = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getCapacity() < 100) {
				taxs[index++] = vehicle.getPrice() * 0.01;

			} else if (vehicle.getCapacity() <= 200) {
				taxs[index++] = vehicle.getPrice() * 0.03;
			} else {
				taxs[index++] = vehicle.getPrice() * 0.05;
			}
		}
		return taxs;
	}
}
