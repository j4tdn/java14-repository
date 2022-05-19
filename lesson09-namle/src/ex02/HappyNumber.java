package ex02;

import java.util.Scanner;

public class HappyNumber{
	public static int sum(int a){
		int sum=0;
		
			while(a>0){
			sum += (a%10)*(a%10);
			a/=10;
			}
		return sum;
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("enter the number!");
		int a = ip.nextInt(); int n = a;
		
			while(a>=9) a=sum(a);
			if(a==1) System.out.println(n +" Is HappyNumber");
			else System.out.println(n + " Is not HappyNumber");
		
	}
}