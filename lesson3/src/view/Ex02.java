package view;

import bean.Car;

public class Ex02 {

	public static void main(String[] args) {
		Car.model = "Audi";
		Car c1 = new Car("Car 1", "Model 1"); 
		Car c2 = new Car("Car 2", "Model 2"); 
		Car c3 = new Car("Car 3", "Model 3");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("==============");
		
		Car.model= "VNI";
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);	
	}

}
