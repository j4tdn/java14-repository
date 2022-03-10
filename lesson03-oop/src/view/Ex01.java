package view;

import bean.Rectangle;

public class Ex01 {
	//toàn vẹn giữ liệu
	//bảo mật
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		//public
		//r1.width=20;
		//r1.height=16;
		
		r1.setWidth(20);
		r1.setHeight(16);
		
		System.out.println(r1);
		
		Rectangle r2= new Rectangle(42,28);
		System.out.println(r2);
	}
}
