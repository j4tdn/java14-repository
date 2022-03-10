package view;

import bean.Car;

public class Ex07 {
	public static void main(String[] args) {
		Car[] cars = initialData("Audi");
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getPrime() > 1000) {
				System.out.println(cars[i]);
			}
		}

	}

	private static Car[] initialData(String model) {
		Car.model = model;
		return new Car[] { new Car("MD1", "RED", 200), new Car("MD2", "RED", 2000), new Car("MD3", "RED", 500),
				new Car("MD4", "RED", 1200), new Car("MD5", "RED", 2200) };
	}
}
