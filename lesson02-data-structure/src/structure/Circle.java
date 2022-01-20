package structure;

public class Circle {
	public Point point;
	public int R;

	//contructor
	public Circle (Point point , int R) {
		this.point = point;
		this.R = R;
	}
	
	@Override
	public String toString() {
		return this.point +" - " + this.R; 
	}
	
}
