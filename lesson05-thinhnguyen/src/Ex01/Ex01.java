package Ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		int n;
		System.out.println(isPowerOfTwo(x,y));
	}
	public static boolean isPowerOfTwo(int x, int y){
		  boolean ret;        
			if( 0 == x|| 1 == x &&  0 == y|| 1 == y)
			{
				ret = false;       
			}
			else{
		        int m = x / y;
		        int n = x % y;
		        while ( x > 0){
		        	if (1 == n) {
		            ret = false;
		            break;
		 		};
				m = x / y;
		        n = x % y;
			}
			ret = true;
			}
		   return ret;
	}
}
