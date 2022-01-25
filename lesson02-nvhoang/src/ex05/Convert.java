package ex05;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập số ở hệ cơ số 10:  ");
		int num,r, sum=0, i=1;
		num= sc.nextInt();
		while(num>0){
			r=num%2;
			sum= sum+(i*r);
			num=num/2;	
			i=i*10;
		}
		System.out.println("Số ở hệ cơ số 2 là: " +sum);
	}
}
