package view;

import bean.Car;

public class Ex07 {
public static void main(String[] args) {
	Car[] cars = initialData("Audi");
	for(int i = 0; i < cars.length; i++) {
		if(cars[i].getPrice() > 1000) {
			System.out.println(cars[i]);
		}
	}
}
private static Car[] initialData(String model) {
	Car.model = model;
	return new Car[] {
			new Car("S1", "Yellow", 200),
			new Car("S2", "Yellow", 2000),
			new Car("S3", "Yellow", 500),
			new Car("S4", "Yellow", 800),
			new Car("S5", "Yellow", 4000)
	};
}
}
