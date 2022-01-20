package structure;

/**
 * 
 * Viết chương trình tìm vị trí tương đối của 1 điểm A so với đường tròn tâm O
 * bán kính R
 * 
 *
 */

public class Ex13 {

	
	
	public static void main(String[] args) {

		Point pA = new Point(3, 5);
		int R = 5;
		Point pO = new Point(0, 0);
		Circle circle = new Circle(pO, R);

		CirclePos pos = findPossion(pA, circle);
		System.out.println(" Vị trí " + pos);
		
		//to do replace == with equals

	}

	private static CirclePos findPossion(Point pA, Circle circle) {
		double distance = Math.sqrt(Math.pow((pA.x - circle.point.x), 2) + Math.pow((pA.y - circle.point.y), 2));

		System.out.println(" distance " + distance);

		if (distance == circle.R) {
			return CirclePos.ONSIDE;
		}

		if (distance < circle.R) {
			return CirclePos.INSIDE;
		}

		return CirclePos.OUTSIDE;

	}

}
