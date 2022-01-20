package structure;

public class Ex13 {

	public static void main(String[] args) {
		Point pA = new Point(3, 5);
		Point pO = new Point(0, 0);
		int R =5;
		Cycle cycle = new Cycle(pO, R);
		
		Position pos = findPos(pA, cycle);
		System.out.println("Vi tri: "+pos);
		

	}
	
	private static Position findPos(Point pA, Cycle cycle) {
		double distance = Math.sqrt(Math.pow(pA.x - cycle.point.x, 2)+ Math.pow(pA.y - cycle.point.y, 2));
		System.out.println("distance: "+distance);
		if(distance ==cycle.R) {
			return Position.ONSIDE;
			
		}
		
		if (distance < cycle.R) {
			return Position.INSIDE;
		}
		
		return Position.OUTSIDE;
		
	}

}
