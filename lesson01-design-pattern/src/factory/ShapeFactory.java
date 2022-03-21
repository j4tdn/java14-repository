package factory;

public class ShapeFactory {
	private ShapeFactory() {
		
	}
	
	public static Shape getShape(ShapeInstance instance) {
		if(instance == ShapeInstance.RECTANGLE) {
			return  new Rectangle();
		}
		if(instance == ShapeInstance.SQUARE) {
			return  new Square();
		}
		return new Shape();
		
	}
}
