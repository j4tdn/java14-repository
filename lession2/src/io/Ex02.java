package io;

import java.util.Random;

/**
 * 
 * Tạo số ngẫu nhiên
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int nanWithoutBroud = rd.nextInt();
		System.out.println("nanWithoutBroud : " + nanWithoutBroud);
		
		int ranWithBroudedRange = rd.nextInt(10);
		System.out.println("ranWithBroudeRange:" + ranWithBroudedRange);
		
		// [a-b] , 8 - 20
		// a + rd.nextInt(b-a+1)
		int number = 8 + rd.nextInt(13);
		System.out.println("Number: " + number);
	}
}
