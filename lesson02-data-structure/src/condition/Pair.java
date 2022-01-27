package condition;

import java.util.Scanner;

public class Pair {
	public static void main(String[] args) {
		int first = 8;
		int second = 18;
		int third = 15;
		
		int max, min, mid;
		int min= Integer.MIN_VALUE;
		int max= Integer.MAX_VALUE;
		if (first > second) {
			max = first;
		} else {
			max = second;
			min = first;
		}
		if (max < third) {
			max = third;
		}
		if (min > third) {
			min = first;
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		}

	private static Pair getMinMax (int first, int second, int third) {
		\
}}