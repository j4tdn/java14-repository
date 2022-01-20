package demo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
public class App {
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int div(int a, int b) {
		return a * b;
	}
	public static int mul(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		while(sum < 100) {
			System.out.println("Moi ban nhap n = ");
			n = sc.nextInt();
			sum+=n;
		}
		System.out.println("Tong so nguen vua nhap : " + sum);
	}
}