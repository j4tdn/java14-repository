package Ex01;
import java.util.Arrays;

public class CarTax {
	public static void main(String[] args) {

		InforCar[] listCar = initalInforCar();
		printTax(listCar);
	}

	private static InforCar[] initalInforCar() {
		return new InforCar[] { new InforCar("Nguyễn Thu Loan", "Future Neo", 100, 35000000),
				new InforCar("Lê Thị Minh Tính", "Ford Ranger", 3000, 250000000),
				new InforCar("Nguyễn Minh Triết", "Landspace", 1500, 1000000000),

		};
	}

	private static double calculatoTax(InforCar car) {

		if (car.getCapacity() < 100) {
			return car.getPrice() * 0.01;
		} else if (car.getCapacity() >= 100 && car.getCapacity() <= 200) {
			return car.getPrice() * 0.03;
		} else
			return car.getPrice() * 0.05;
	}

	private static void printTax(InforCar[] cars) {
		System.out.println("name \t \t \t"  +  " model   \t"   + " capacity  \t"   + " price \t \t" + " tax"    );
		System.out.println("===================================================================================");

		for (InforCar car : cars) {
			  System.out.printf("%5s \t %10s \t %5d \t\t %10.2f \t %10.2f  \n",
					  car.getName(),car.getModel(),car.getCapacity(),car.getPrice(),calculatoTax(car));
	    }
	}

	//	}
//	}
}
