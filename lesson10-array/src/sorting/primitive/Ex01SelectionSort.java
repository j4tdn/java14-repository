package sorting.primitive;

import java.util.Arrays;
import java.util.function.Function;

import utils.ArrayUtils;

public class Ex01SelectionSort {
	public static void main(String[] args) {
		int[] elements = {1, 5, 9, 4, 6, 11}; 
		// sort(elements, true);
		// sort(elements, (pre, next) -> pre > next);
		sort(elements, Comparable::desc);
		
		ArrayUtils.printf(elements);
	}
	
	// Interface: boolean compare(a, b)
	private static void sort(int[] elements, Comparable comparable) {
		for (int round = elements.length - 1; round > 0; round --) {
			for (int i = 0; i < round; i++) {
				// ascending
				if (comparable.compare(elements[i], elements[round])) {
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
	
	private static void sort(int[] elements, boolean isAsc) {
		for (int round = elements.length - 1; round > 0; round --) {
			for (int i = 0; i < round; i++) {
				// ascending
				boolean isSwap = isAsc ? elements[i] > elements[round] : elements[i] < elements[round];
				if (isSwap) {
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
}
