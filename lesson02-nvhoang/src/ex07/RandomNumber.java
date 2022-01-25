package ex07;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int[] a= new int[5];
		
		Random rd = new Random();
		int i=0;
		while(true) {
			int number = 20 + rd.nextInt(10);
			if(check(a, number)) {
				a[i]=number;
				i++;
			}
			if(i==5) {
				break;
			}
		}
		for(int b:a) {
		System.out.print(b +" ");
	}
		
	}
	public static boolean check(int [] array, int n) {
		for(int b=0; b<array.length; b++) {
			if(n==array[b]) {
				return false;
			}
		}
		return true;
	}
	
}
