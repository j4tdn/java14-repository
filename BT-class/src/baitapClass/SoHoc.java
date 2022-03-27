package baitapClass;

import java.util.Scanner;

public class SoHoc {
	private int number1;
	private int number2;
	public SoHoc() {
		
	}
	public SoHoc(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	@Override
	public String toString() {
		return number1 + ", " + number2;
	}
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap number1 : ");
		number1 = sc.nextInt();
		System.out.println("Nhap number2 : ");
		number2 = sc.nextInt();
	}
	public void printInfo() {
		System.out.println("Number1 : " + number1);
		System.out.println("Number2 : " + number2);
	}
	public int addition() {
		return number1 + number2;
	}
	public int subtract() {
		return number1 - number2;
	}
	public int multi() {
		return number1 * number2;
	}
	public int division() {
		return number1 / number2;
	}
}
