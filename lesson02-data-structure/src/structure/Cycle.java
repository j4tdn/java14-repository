package structure;

public class Cycle {
	public Point point;
	public int R;
	
	public Cycle(Point point, int R) {
		this.point = point;
		this.R =R;
	}
	
	@Override
	public String toString() {

		return point+ ", ban kinh: "+R;
	}
}
