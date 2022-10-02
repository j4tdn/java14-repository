package bt3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Bai3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
	    boolean result = isHappy(n);
	    System.out.print(result);
	}
	public static boolean isHappy(int n) {
	    Set<Integer> inLoop = new HashSet<Integer>();
	    int squareSum,remain;
	    while (inLoop.add(n)) {
	        squareSum = 0;
	        while (n > 0) {
	            remain = n%10;
	            squareSum += remain*remain;
	            n /= 10;
	        }
	        if (squareSum == 1)
	        	return true;
	        else
	        	n = squareSum;
	    }
	    return false;
	} 
}