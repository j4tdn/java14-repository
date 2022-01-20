package io;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner ip= new Scanner(System.in);
	
	System.out.print("Enter your first name: ");
	String firstname = ip.nextLine();
	
	System.out.print("Enter your last name: ");
	String lasttname = ip.nextLine();
	
	System.out.println("Enter your age: ");
	//int age=ip.nextInt();
	//cách 1 tránh trôi lệnh:
	//ip.nextLine();
	//cách 2:
	int age= Integer.parseInt(ip.nextLine());
	System.out.print("Age: " +age);
	
	System.out.print("Enter something: ");
	String emptyText=ip.nextLine();
	
	System.out.print("Fullname: " +(firstname + lasttname));
	System.out.println("emptyText |||" + emptyText + "|||");
	
}
}
