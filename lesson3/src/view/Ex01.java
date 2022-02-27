package view;

import bean.Rectangle;

public class Ex01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		//public
		//r1.width = 20;
		//r1.height = 16;
		
		//private --> getter, setter
		r1.setWidth(20);
		r1.setHeight(16);
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(4,5);
		System.out.println(r2);
	}
	
}
