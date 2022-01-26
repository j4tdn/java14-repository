package ex01;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int[] test = new int[5];
		test = randomNumberBetween20_30(5);
		for (int testing: test) {
			System.out.print(testing + " ");
		}
    }
	    
	public static int[] randomNumberBetween20_30(int n) {
	    Random rd = new Random();
	    int count = 0;
	    int[] result = new int[11]; // Mảng kết quả
	    int[] check = new int[11]; // Mảng trung gian
	    while (count < n) {
	    	int temp = rd.nextInt(10) + 20;
	    	if(check[temp - 20] == 0) {
	    		result[count] = temp;
		    	count++;
	    	}
	    	check[temp - 20]++;
	    }
	    return Arrays.copyOf(result, n);
    }
}
