package ex01;

import java.util.Scanner;

public class EquationOfDegree1 {
	protected int a;
	protected int b;
	
	private static Scanner sc = new Scanner(System.in);
	
	public EquationOfDegree1() {
	}

	public EquationOfDegree1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "" + a + "x " + ((b>0)?"":"+") + b + " = 0";
	}
	
	public void solveEquationOfDegree1() {
    	try {
			System.out.println("x = " + (-this.getB()/this.getA()));
		} catch (ArithmeticException e) {
			System.out.println("Khong chia 0"); // pt vo nghiem hoac vo so nghiem
		}
    }
    
    public void enterEquation() {
    	String ipA = null;
    	String ipB = null;
    	System.out.println("Enter Equation: ");
    	do {
			System.out.print("Enter A: ");
			ipA = sc.nextLine();
			System.out.print("Enter B: ");
			ipB = sc.nextLine();
			if(ipA.matches("\\d+") && ipB.matches("\\d+")) {
				break;
			}
			System.out.println("Invalid Equation, enter again: ");
		} while (true);
    	this.a = Integer.parseInt(ipA);
    	this.b = Integer.parseInt(ipB);
    }
}
