package Ex02;

import java.util.Scanner;

public class HappyNumber {
	private static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		while(true) {
			n=sc.nextInt();
			if(isHappyNumber(n)) {
				System.out.println("n is happy number");
			}
			else {
				System.out.println("n is FA number");
			}
		}
	}
	private static boolean isHappyNumber(int n) {
		if(n==1 || n==7) {
			return true;
		}
		while(n>9) {
			int []arr= new int[10];
			int temp=n;
			int count=0;
			while(temp!=0) {
				arr[count++]=temp%10;
				temp=temp/10;
			}
			n=sqrtArr(arr, count);
			if(n==1) {
				return true;
			}
		}
		return false;
	}
	private static int sqrtArr(int []arr,int length) {
		int rs=0;
		for(int i=0;i<length;i++) {
			rs+=Math.pow(arr[i],2);
		}
		return rs;
	}
}
