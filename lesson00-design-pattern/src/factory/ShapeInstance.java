package factory;

public enum ShapeInstance {
	// enumeration
	// store set of final elements 
	// ShapeInstance SQUARE = new ShapeInstance("hinh vuong")
	SQUARE("hinh vuong"),
	RECTANGLE("hinh chu nhat");
	
	String value;
	
	ShapeInstance(String value) {
		this.value = value;
	}
}
