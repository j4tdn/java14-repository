package factory;

public class Ex01 {
	public static void main(String[] args) {
		Shape s1 = ShapeFactory.getShape(ShapeInstance.SQUARE);
		s1.draw(); // 3

		Shape s2 = ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		s2.draw(); // 2

		s1 = s2;
		s1.draw();
	}
}
