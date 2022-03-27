package package01;

import java.util.Scanner;

public class App01 {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number is needed checking: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(isPowerOf(a,b));
	}
	public static boolean isPowerOf(int a,int b) {
		for (int i = 0; i < a; i++) {
			if (Math.pow(b, i) == a) {
				return true;
			}
		}
		return false;
	}


}
