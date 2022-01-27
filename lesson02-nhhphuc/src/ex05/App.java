package ex05;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		long dec,rem,i=1,sum=0;
	    System.out.println("Nhập số cần chuyển:");
	    Scanner sc = new Scanner(System.in);
	    dec = sc.nextLong();
	    System.out.println(dec);
	    do
	    {
	        rem=dec%2;
	        sum=sum + (i*rem);
	        dec=dec/2;
	        i=i*10;
	    }
	    while(dec>0);
	    System.out.println("Hệ nhị phân của số trên là:"+ sum);
	}
}
