package factory;

public class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Square =>> draw...");
	}
	@Override
	void calculate() {
		// TODO Auto-generated method stub
		System.out.println("3. Square calculate => x*x");
	}
}
