package structure;
/** 
 * Viet chuong trinh tim vi tri tuong doi cua 
 * mot diem A so voi duong tron tam O ban kinh R
 * A(5,7) , [O(0,0) , R = 6]
 */
public class Ex13 {
	public static void main(String[] args) {
		Point pA = new Point(3, 4);
		Point pO = new Point(1, 0);
		int R = 5;
		Circle circle = new Circle(pO,R);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("Vi tri " + pos);
		
		//Todo : replace == with equals
		if(pos == CirclePos.INSIDE) {
			System.out.println("Do futher things .....");
		}
	}
	
	private static CirclePos findPos(Point pA , Circle circle){
		//sqrt[(xA-x0)^2 + (yA-yO)^2]
		double distance = Math.sqrt(Math.pow(pA.x - circle.point.x, 2) + Math.pow(pA.y - circle.point.y, 2));
		System.out.println("distance " + distance);
		if(distance == circle.R) {	
			return CirclePos.ONSIDE;
		}
		
		if(distance < circle.R) {
			return CirclePos.INSIDE;
		}
		return CirclePos.OUTSIDE;
	}
}