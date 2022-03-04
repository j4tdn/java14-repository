package data;

import bean.Vehicle;

public class DataVehicle {
	
	private DataVehicle() {
	}
	public static Vehicle[] initialVehicle() {
		return new Vehicle[] {
				new Vehicle("Phạm Văn Oanh", "Future", 100, 35000000),
				new Vehicle("Lê Tuấn Dũng", "AB Lade", 3000, 250000000),
				new Vehicle("Ngô Thanh Vân", "Sirius", 1500, 1000000000),
				new Vehicle("Trần Nam Hải", "WaveAlpha", 200, 32000000)
				
		};
	}
}
