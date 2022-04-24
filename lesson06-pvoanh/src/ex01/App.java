package ex01;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a;
		int b;
		do {
			System.out.print("enter a: ");
			String var1=sc.next();
			System.out.print("enter b: ");
			String var2=sc.next();
			if(var1.matches("[0-9]+")  && var2.matches("[0-9]+")) {
				a=Integer.parseInt(var1);
				b=Integer.parseInt(var2);
				break;
			}
			System.out.println("enter the value is a digit");
		} while (true);
		double rs=0;
		try {
			rs=linearFunction(a, b);
		} catch (Exception e) {
			while(true) {
				System.out.println("your a's value is 0, you must enter a!0");
				System.out.print("enter a !=0 : ");
				a=sc.nextInt();
				System.out.print("enter b again: ");
				sc.nextInt();
				if(a!=0) {
					rs=linearFunction(a, b);
					break;
				}
			}
		}
		System.out.println(rs);

	}

	private static double linearFunction(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("a = 0, please enter a !=0");
		}
		return -b / a;
	}

}
