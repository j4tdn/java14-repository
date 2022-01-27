// cach push: 1:36:30
package ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Moi ban nhap so: ");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int result = isPower(n);
		System.out.println(n);
		if(n%2==0) {
			System.out.println(n + " la luy thua cua 2");
		}
		else{
			System.out.println(n + " khong la luy thua cua 2");
		}
	}
	
	public static int isPower(int n) {
		int a = n / 2;
		if (n%2==1) 
		return isPower(a);
		return a;
	}
}
