package sorting.object;

import utils.ArrayUtils;

public class Ex01StringSorting {
	public static void main(String[] args) {
		String[] sequences = { "1", "0", null, "x", "a", "b", null, "10", "2" };

		sortNullLast(sequences);
		ArrayUtils.printf(sequences);
		sortNullFirst(sequences);
		ArrayUtils.printf(sequences);
	}

	// sort select string
	private static void sort(String[] elements) {
		for (int out = elements.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if(elements[in].compareTo(elements[out]) > 0) {
					String temp = elements[in];
					elements[in] = elements[out];
					elements[out] = temp;
				}
			}
		}
	}
	// 'null first'
		private static void sortNullFirst(String[] elements) {
			for (int out = elements.length - 1; out > 0; out--) {
				for (int in = 0; in < out; in++) {
					// null first
					if(elements[out] == null && elements[in] != null) {
						String temp = elements[in];
						elements[in] = elements[out];
						elements[out] = temp;
						continue;
					}
					// special case: elements[out] == null and elements[in] == null
					// elements[out] != null
					if(elements[in] == null) {
						continue;
					}
					// elements[out] != null and elements[in] != null
					// ascending
					if(elements[in].compareTo(elements[out]) > 0) {
						String temp = elements[in];
						elements[in] = elements[out];
						elements[out] = temp;
					}
				}
			}
		}
	//'null-last'
	private static void sortNullLast(String[] elements) {
		for (int out = elements.length - 1; out > 0; out--) {
			if(elements[out] == null) {
				continue;
			}
			// elements[out] != null
			for (int in = 0; in < out; in++) {
				// null last
				if(elements[in] == null) {
					String temp = elements[in];
					elements[in] = elements[out];
					elements[out] = temp;
					break;
				}
				// sort elements != null
				// ascending
				if(elements[in].compareTo(elements[out]) > 0) {
					String temp = elements[in];
					elements[in] = elements[out];
					elements[out] = temp;
				}
			}
		}
	}
	
	
}
