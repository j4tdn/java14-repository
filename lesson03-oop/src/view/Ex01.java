package view;

import bean.Rectangle;

public class Ex01 {
	//toan ven du lieu
	//bao mat du lieu
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 20;
		r1.height = 16;
		
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(42, 18);
		System.out.println(r2);
		
	}
}
