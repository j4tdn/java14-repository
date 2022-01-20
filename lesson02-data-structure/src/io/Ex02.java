package io;

import java.util.Random;

/**
 * Tạo số ngẫu nhiên
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Random random = new Random();

		int randWithoutBound = random.nextInt();
		System.out.println("randWithoutBound: " + randWithoutBound);

		int randWithBoundRange = random.nextInt(10);// [0 - bound)
		System.out.println("randWithBoundRange: " + randWithBoundRange);

		// [a - b], 8 -20
		// a + random.nextInt(b - a + 1)
		int a = 8;
		int b = 20;
		int number = 8 + random.nextInt(13);
		System.out.println("number: " + number);
	}
}
