package data;

import bean.BuyVehicle;
import bean.Vehicle;

public class dataSample {
	private dataSample() {
		
	}
	
	public static Vehicle[] initialVehicle() {
		return new Vehicle []{
			new Vehicle("WaveAlpha",100, 35000000.0),
			new Vehicle("FuturePro", 3000, 250000000.0),
			new Vehicle("SiriusFi",1500,1000000000.0)
			
		};
	}
	public static BuyVehicle[] initialBuyVehicle( Vehicle []vehicles) {
		return new BuyVehicle[] {
				new BuyVehicle("Phạm Văn Oanh", vehicles[0]),
				new BuyVehicle("Nguyễn Tấn Công", vehicles[2]),
				new BuyVehicle("Ngô Thanh Vân", vehicles[1]),
		};
		
	}
}
