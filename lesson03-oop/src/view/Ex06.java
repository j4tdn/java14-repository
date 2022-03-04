package view;

import java.util.Arrays;

/**
 * 1. Find odd. prime number from input number list
 * 2. find car have price >1000 
 * @author Oanhpv1008
 *
 */

public class Ex06 {
	public static void main(String[] args) {
		int []numbers= {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(findOddNumbers(numbers)));
	}
	private static int[] findOddNumbers(int []ip) {
		int[]rs= new int [ip.length];
		int index=0;
		for(int i:ip) {
			if( i%2 != 0) {
				rs[index++]=i;
			}
		}
		return Arrays.copyOfRange(rs, 0, index);
	}
	

}
