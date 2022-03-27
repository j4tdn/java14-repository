package inheritance.interfacee;

public class App {
	public static void main(String[] args) {
		Triangle triangle= new Triangle();
		triangle.draw();
		triangle.calculate();
		
		System.out.println("=====================");
		
		Shape  shape= new Triangle();
		shape.draw();
		shape.calculate();
		
		
		System.out.println("==============");
		Shape parent= new Anonymous();
		parent.draw();
		parent.calculate();
	}
}
