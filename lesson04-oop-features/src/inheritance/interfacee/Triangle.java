package inheritance.interfacee;

public class Triangle implements Shape {
	// class implements interface 
	//required: override all abstract methods from interface
	@Override
	public void draw() {
		System.out.println("Trianle ==> drawing ..");
		
	}
	@Override
	public void calculate() {
	
		System.out.println("Trianle => calculate..");
	}
	@Override
	public void setColor() {
		System.out.println("Trianle => blue");
	}
	@Override
	public void setBackground() {
		
		System.out.println("Triangle => bluere");
	}
}
