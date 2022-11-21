package inheritance.interfacee;

public class Ex01App {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.draw();
		triangle.calculate();

		System.out.println("===============");

		Shape shape = new Triangle();
		shape.draw();
		shape.calculate();

		System.out.println("============");
		// Shape parent = new Shape();
		// anonymous class
		Shape parent = new Anonymous();
		parent.calculate();
		parent.draw();

		// how to construct an instance of interface
		// option 1 : new interface directly and use anonymous class
		// option 2 : create child class implements from interface
		// and then use interface = new child class
	}

}
