package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex02StringSortingJava {
	public static void main(String[] args) {
		String[] sequences = { "1", "0", "4",null, "6", "9",null, "10", "2" };

		// Arrays.sort(Object[])
		// --> Object is a Comparable, override compareTo(o), --> ASC || DESC

		// Arrays.sort(T[], Comparator<T>)
		// --> int compare(T o1, T o2);

		// --> Object is a normal class, ASC|DESC, check null --> handle in Comparator
		// parameter

		// String implements Comparable<String> OK
		// Support ASC
		// No DESC, no NPE handling

		// Arrays.sort(sequences);

		Arrays.sort(sequences, new Comparator<String>() {
			// o1: previo
			// o2: next
			// compare(o1,o2) > 0 --> swap(o1,o2)
			// compare(o1,o2) = 0 --> ...
			// compare(o1,o2) < 0 --> ....
			@Override
			public int compare(String o1, String o2) {
				// null first
				/* if(o2 == null && o1 != null) {
					return 1;
				}
				
				// o2  != null
				if (o1 == null) {
					return -1;
				}*/
				//null last
				if (o2 == null) {
					return -1;
				}

				// o2 !=null
				if (o1 == null) {
					return 1;
				}
				
				return o2.compareTo(o1);
			}

		});

		ArrayUtils.printf(sequences);

	}
}
