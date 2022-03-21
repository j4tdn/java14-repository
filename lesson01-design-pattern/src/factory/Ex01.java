package factory;

public class Ex01 {
	public static void main(String[] args) {
		Shape shape= ShapeFactory.getShape(ShapeInstance.SQUARE);
		shape.draw();
		
		Shape square= ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		square.draw();
		
		          
		
		          
	}	
}
