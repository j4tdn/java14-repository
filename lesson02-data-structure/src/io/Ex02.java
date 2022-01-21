package io;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int randWithBounded = rd.nextInt();
		System.out.println("rand withoutBoud :"+ randWithBounded);
		
		int randWithBoundedRange = rd.nextInt(10);
		System.out.println("rand withoutBoud :"+ randWithBoundedRange);
	
		int number = 8 + rd.nextInt(13);
		System.out.println("number: "+number);
	}
}
