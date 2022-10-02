package sorting.primitive;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04QuickSort {
	public static void main(String[] args) {
		int[] numbers = { 4, 3, 2, 10, 12, 1, 5, 6 };
		
		// Java Quick Sort 
		// default ascending
		Arrays.sort(numbers);
		// muốn giảm dần thì tự tạo hàm reverse ra
		ArrayUtils.reverse(numbers);
		
		ArrayUtils.printf(numbers);
	}
}