package polymorphism.method;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println(x + y + isPo);
	}
	private boolean isPowerOfTwo(int n){
		if( 0 == n|| 1 == n ) return true;
		int x = n / 2;
		int y = n%2;
		if (1 == y) return false;
		return isPowerOfTwo(x);
	}
}
