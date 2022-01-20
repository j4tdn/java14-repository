package structure;
/**
 * Viết chương trình tìm vị trí tương đối của
 * một điểm A so với đường tròn tâm O bán kính R
 * A(5, 7), [O(0,0), R = 6]
 *  */
public class Ex13 {
	private static final String INSIDE = "inside";
	private static final String ONSIDE = "onside";
	private static final String OUTSIDE = "outside";
	
    public static void main(String[] args) {
		Point pA = new Point(3, 4);
		
		Point pO = new Point (0, 0);
		int R = 6;
		Circle circle = new Circle(pO, R);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("Vị trí: " + pos);
		
		// TODO: replace == with equals
		if (pos == CirclePos.INSIDE) {
			System.out.println("Do futher things ....");
		}
	}
    
    private static CirclePos findPos(Point pA, Circle circle) {
    	double distance = Math.sqrt(Math.pow(pA.x - circle.point.x, 2) + Math.pow(pA.y - circle.point.y, 2));
    	System.out.println("distance: " + distance);
    	
    	if (distance == circle.R) {
    		// hard code
    		return CirclePos.ONSIDE;
    	}
    	if (distance < circle.R) {
    		return CirclePos.INSIDE;
    	}
    	
    	return CirclePos.OUTSIDE;
    }
}
