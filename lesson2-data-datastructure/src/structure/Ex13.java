package structure;
/**
 * Viết chương trình tìm vị trí tương đối đường tròn
 * A(5,7) ) (0,0) R=6
 * @author ADMIN
 *
 */
public class Ex13 {
	/*
	 * private static String INSIDE= "Trong đường tròn"; 
	 * private static String ONSIDE= "Trên đường tròn"; 
	 * private static String OUTSIDE= "Ngoài đường tròn";
	 */
	
	
	
	
	public static void main(String[] args) {
		Point pA= new Point(3,4);
		
		Point pO= new Point(0,0);
		int R=6;
		Circle circle = new Circle(pO,R);
		
		CirclePos pos=findPos(pA,circle);
		System.out.println("Vị trí:"+ pos);
	
		//Todo replate== with equals
		if(pos == CirclePos.INSIDE) {
			System.out.println("Do futher thing...");
		}
	}
	private static CirclePos findPos(Point pA,Circle circle ) {
		//(xa-x0)^2 (ya-yo)^2
		double distance = Math.sqrt(Math.pow((pA.x- circle.point.x),2) + Math.pow((pA.y-circle.point.y), 2));
		System.out.println("distance : "+ distance);
		if(distance == circle.R) {
			//hard code
			return CirclePos.ONSIDE;
		}
		if(distance < circle.R) {
			return CirclePos.INSIDE;
		}
		return CirclePos.OUTSIDE;
		
		
	}
}
