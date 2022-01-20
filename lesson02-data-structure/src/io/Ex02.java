package io;

import java.util.Random;

/**
 * 
 * tạo số ngẫu nhiên
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		int ranWithoutBound = rd.nextInt();
		System.out.println("ranWithoutBound" + ranWithoutBound);
		int ranWithoutBoundedRange = rd.nextInt(10);
		System.out.println("ranWithoutBoundedRange" + ranWithoutBoundedRange);

		int number = 8 + rd.nextInt();
		System.out.println("number +" + number);
	}
}
