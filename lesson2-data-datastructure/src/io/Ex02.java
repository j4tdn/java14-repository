package io;
//Tao so ngau nhien

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int randWithoutBound = rd.nextInt();
		System.out.println("randWithoutBound" + randWithoutBound);
		
		int randWithoutBoundRange = rd.nextInt(10); //[0- bound]
		System.out.println("randWithoutBoundBound"+ randWithoutBoundRange);
		
		//[a-b], 8-20
		// a+rd.nextInt(b-a+1);
		int number= 8+ rd.nextInt(13);
		System.out.println("number"+ number);
	}
}
