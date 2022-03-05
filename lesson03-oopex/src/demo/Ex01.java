package demo;

import bean.Rectangle;

public class Ex01 {
	// to String
	// class, object ==> instance, entity

	public static void main(String[] args) {
		// r1: w8 h4
		Rectangle r1 = new Rectangle();
		r1.setWidth(8);
		r1.setHeight(4);
		System.out.println("r1: " + r1);

		// r2: w6 h3
		Rectangle r2 = new Rectangle(9, 7);
		System.out.println("r2: " + r2);
		//class, object
		//constructor, getter, setter
		//this, toString
		
	}
}
