package sorting.primitive;

import java.lang.reflect.Array;

import funtional.Comparable;
import utils.ArrayUtils;

public class Ex01SelectionSort {

	public static void main(String[] args) {
		int[] elements = { 1, 5, 9, 4, 6, 11 };
		sort(elements, Comparable::asc);
		ArrayUtils.printf(elements);

	}

	private static void sort(int[] elements, Comparable comparable) {
		int length = elements.length;
		for (int round = length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				// ascending
				if (comparable.compare(elements[i], elements[round])) {
					ArrayUtils.swap(elements, i, round);
				}

			}
		}
	}

}
