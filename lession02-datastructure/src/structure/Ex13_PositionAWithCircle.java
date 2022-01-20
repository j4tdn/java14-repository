package structure;

public class Ex13_PositionAWithCircle {
	public static void main(String[] args) {
		Point pA = new Point(3, 4);
		Point pO = new Point(0, 0);
		int R = 6;
		Circle circle = new Circle(pO, R);
		System.out.println(findPosition(pA, circle).value);
	}

	private static CirclePos findPosition(Point pA, Circle circle) {
		double distance = Math.sqrt(Math.pow(pA.x - circle.point.x, 2) + Math.pow(pA.y - circle.point.y, 2));

		if (distance == (double) circle.R) {
			return CirclePos.ONSIDE;
		}
		if (distance > (double) circle.R) {
			return CirclePos.OUTSIDE;
		}
		return CirclePos.INSIDE;

	}

}
