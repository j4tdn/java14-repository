package io;

import java.util.Random;

/**
 * tạo số ngẫu nhiên
 * @author nguye
 *
 */
public class Ex02 {
public static void main(String[] args) {
	Random rd=new Random();
	
	int randWithoutBound = rd.nextInt();
	System.out.println("randWithoutBound: "+randWithoutBound);
	int randWthihBoundedRange= rd.nextInt(10);
	System.out.println("randWithBoundedRange: "+ randWthihBoundedRange);
//[a-b], 8-20
	// a+ rd.nextInt(b-a+1)
	int number = 8 + rd.nextInt(12) ;
	System.out.println("number: "+ number);
}
}
