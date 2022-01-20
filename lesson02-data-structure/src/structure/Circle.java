package structure;

public class Circle {
    public Point point;
    public int R;
    
    public Circle(Point point, int R) {
    	this.point = point;
    	this.R = R;
    }
    
    @Override
    public String toString() {
    	return point + " - " + R;
    }
}
