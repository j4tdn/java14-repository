package sorting.primitive;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] numbers = { 4, 3, 2, 10, 12, 1, 5, 6 };
		
		insertionSort(numbers);
		ArrayUtils.printf(numbers);
		
	}
	
	private static void insertionSort(int[] elements) {
		int length = elements.length;
		for(int i=1;i<length;i++) {
			for(int j = 0 ;j<i;j++) {
				if(elements[j] > elements[i]) {
					ArrayUtils.swap(elements, i, j);
				}
			}
		}
		
	}
}
