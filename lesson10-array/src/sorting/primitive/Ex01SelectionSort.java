package sorting.primitive;


import utils.ArrayUtils;

public class Ex01SelectionSort {
	public static void main(String[] args) {
		int[] elements = { 1, 5, 11, 9, 4, 6 };
		//sort(elements, (pre, next) -> pre > next);
		sort(elements, Comparable::desc);
		
		
		
		ArrayUtils.printf(elements);
	}

	private static void sort(int[] elements, Comparable comparable) {
		for (int round = elements.length - 1; round > 0; round--) {
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

//	private static void sort(int[] elements, boolean isAsc) {
//		for (int round = elements.length - 1; round > 0; round--) {
//			for (int i = 0; i < round; i++) {
//				// ascending
//				boolean isSwap = isAsc ? elements[i] > elements[round] : elements[i] < elements[round];
//				if (isSwap) {
//					int tmp = elements[i];
//					elements[i] = elements[round];
//					elements[round] = tmp;
//				}
//			}
//		}
//	}
}
