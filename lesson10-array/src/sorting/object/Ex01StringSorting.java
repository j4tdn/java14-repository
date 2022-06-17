package sorting.object;

import utils.ArrayUtils;

public class Ex01StringSorting {
	public static void main(String[] args) {
		String[] sequences = {null, "0", null, "x", "x", "a", "b", null, "10", null };
		
		sortNullFirst(sequences);
		
		ArrayUtils.printf(sequences);

	}

//	
//	private static void sortNulllast(String[] elements){
//		
//	}
//	
	
	private static void sortNullFirst(String[] elements) {
		int length = elements.length;
		for (int out = length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (elements[out] == null && elements[in] != null) {
					ArrayUtils.swap(elements, out, in);
					continue;
				}

				if (elements[in] == null) {
					continue;
				}

				if (elements[in].compareTo(elements[out]) > 0) {
					ArrayUtils.swap(elements, out, in);
				}
			}
		}
	}
}
