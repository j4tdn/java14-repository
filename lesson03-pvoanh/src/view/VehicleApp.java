package view;
import static data.dataSample.*;

import java.util.Arrays;

import bean.BuyVehicle;
import bean.Vehicle;
public class VehicleApp {
	private static BuyVehicle buyVehicle;
	public static void main(String[] args) {
		Vehicle[] vehicles= initialVehicle();
		
		BuyVehicle[]buyVehicles= initialBuyVehicle(vehicles);
		calculateTax(buyVehicles);
		
		System.out.println("Tên chủ xe"+"\t"+"Loại xe"+ "\t\t"+"Dung tích"+"\t"+"Trị giá"+"\t\t"+"Thuế phải nộp");
		System.out.println("====================================================================================");
		for(BuyVehicle buyVehicle:buyVehicles) {
			System.out.print(buyVehicle.getNameOfOwner()+"\t"+
							 buyVehicle.getVehicle().getType()+"\t"+
							 buyVehicle.getVehicle().getCapacity()+"\t\t"+
							 buyVehicle.getVehicle().getPrice()+"\t\t"+
							 buyVehicle.getTax()+"\n"
					);
			
			
		}
	

	}
	private static void calculateTax(BuyVehicle[]buyVehicles) {
		for(BuyVehicle buyVehicle:buyVehicles) {
			int capacity=buyVehicle.getVehicle().getCapacity();
			if(capacity < 100) {
				buyVehicle.setTax(buyVehicle.getVehicle().getPrice()*0.01);
			}
			else if(capacity <=200) {
				buyVehicle.setTax(buyVehicle.getVehicle().getPrice()*0.03);
			}
			else {
				buyVehicle.setTax(buyVehicle.getVehicle().getPrice()*0.05);
			}
		}
		
	}
}
