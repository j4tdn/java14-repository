package sorting.primitive;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04QuickSort {
	public static void main(String[] args) {
		int[]elements= {4,3,2,10,12,1,5,6};
		Arrays.sort(elements);
		ArrayUtils.reverse(elements);
		ArrayUtils.printf(elements);
	}
	private static void sort(int []elements) {
		
	}
}
