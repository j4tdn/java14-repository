package sorting.object;

import utils.ArrayUtils;

public class Ex01StringSorting {
	public static void main(String[] args) {
		String[] sequences = { "1", "0", null, "x", "a", "b", null, "10", "2" };

		sortNullLast(sequences);
		ArrayUtils.printf(sequences);
	}

	// 'null-first', null-last
	private static void sortNullFirst(String[] elements) {
		for (int out = elements.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				// handle Null first | last
				// null first
				if (elements[out] == null && elements[in] != null) {
					String tmp = elements[in];
					elements[in] = elements[out];
					elements[out] = tmp;
					continue;
				}
				
				// special case elements[out] = null and elements[in] = null 
				// elements[out] != null
				if (elements[in] == null) {
					continue;
				}
				
				// elements[out] != null
				// elements[in] != null
				// handle ASC || DESC
				if (elements[in].compareTo(elements[out]) < 0) {
					String tmp = elements[in];
					elements[in] = elements[out];
					elements[out] = tmp;
				}
			}
		}
	}

	// null-first, 'null-last'
	private static void sortNullLast(String[] elements) {
		for (int out = elements.length - 1; out > 0; out--) {
			if (elements[out] == null) {
				continue;
			}
			// elements[out] != null
			for (int in = 0; in < out; in++) {
				// null last
				if (elements[in] == null) {
					String tmp = elements[in];
					elements[in] = elements[out];
					elements[out] = tmp;
					break;
				}
				if (elements[in].compareTo(elements[out]) > 0) {
					String tmp = elements[in];
					elements[in] = elements[out];
					elements[out] = tmp;
				}
			}
		}
	}
}
