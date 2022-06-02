package sorting.primitive;

import utils.ArrayUtils;

public class Ex01SelectionSort {
	public static void main(String[] args) {
		int[]numbers= {2,5,9,4,6,11};
		sort(numbers, Comparable::desc);
		ArrayUtils.printf(numbers);
	}
	private static void sort(int []numbers,Comparable comparable) {
		for(int round=numbers.length-1;round>0;round--) {
			for(int i=0;i<round;i++) {
			
				
				if(comparable.compare(numbers[i],numbers[round])) {
					int temp=numbers[i];
					numbers[i]=numbers[round];
					numbers[round]=temp;
				}
			}
		}
	}
}
