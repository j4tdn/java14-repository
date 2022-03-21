package polymorphism.object;

public class Rectangle  extends Shape{
	@Override
	void draw() {
		System.out.println("Rectangle =>> draw...");
	}
	@Override
	void calculate() {
		System.out.println("2. Ractangle  calculate ==> width * height");
	}
}
