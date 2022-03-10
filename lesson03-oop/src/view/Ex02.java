package view;

import bean.Car;

public class Ex02 {
	public static void main(String[] args) {
		//ctr+alt+xuong
		Car c1 = new Car("MD1","RED");
		Car c2 = new Car("MD2","YEL");
		Car c3 = new Car("MD3","PINK");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println("==========");
				
		Car.model="Vni";
		System.out.println(c1);
	}
}
