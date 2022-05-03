package ex01;

import java.util.Scanner;


public class Equation {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	
		float a, b;		
		String sa , sb;
		double result = 0;
		
		do {
			System.out.println("enter the number a");
			sa = input.nextLine();
			System.out.println("enter the number b");
			sb = input.nextLine();
			
		try {
			a = Float.parseFloat(sa);
			b = Float.parseFloat(sb);
			result = solveEquation(a, b);
			break;
			
		
		}catch (Exception e) {	
				System.out.println(e.getMessage());
				System.out.println("enter again");
		
		}
		}while(true);
		
		System.out.println("result of Equation: "+result);
		
		
	}
	public static double solveEquation(float a, float b)
	{
		String sa = String.valueOf(a);
		String sb =  String.valueOf(b);
	
		
		
		if(a == 0) {
			
			throw new ArithmeticException("cannot divide by zero");
			
		}
		
		if(!sa.matches(".*[0-9].*") || !sb.matches(".*[0-9].*"))
		{
			throw new NumberFormatException("invalid number ");
		}
		
		return (float)-b/a;
	}
	
	
}
