package view;

import baitapClass.SoHoc;

public class Ex01 {
	public static void main(String[] args) {
		SoHoc s1 = new SoHoc();
		s1.inputInfo();
		s1.printInfo();
		System.out.println("Addition: "+s1.addition());
		System.out.println("Subtract: "+s1.subtract());
		System.out.println("Multi: "   +s1.multi());
		System.out.println("Division: "+s1.division());
	}
}
