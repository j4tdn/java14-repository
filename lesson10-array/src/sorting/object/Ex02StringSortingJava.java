package sorting.object;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex02StringSortingJava {
	public static void main(String[] args) {
		String[] sequences = { "1", "0", null,"x", "a", null ,"b", "10", "2" };
		
		// Arrays.sort(Object[]) --> Object is a Comparable, override compareTo(o) --> ASC || DESC
		// Support ASC
		// No DESC No null handeling
//		Arrays.sort(sequences);
//		ArrayUtils.printf(sequences);
		
		
		// Arrays.sort(T[],Comparator<T>)
		// --> Object is a nomal class, ASC || DESC , check null --> handle in Comparator parametter
		
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//Null first 
				if(o2 == null && o1 != null) {
					return -1;
				}
				if(o1 == null) {
					return 1;
				}
				// Null last 
//				if(o1 == null) {
//					return 1;
//				}
//				
//				if(o2 == null) {
//					return -1;
//				}
				return o1.compareTo(o2);
			}
		});
		
	ArrayUtils.printf(sequences);
		
		
	}
	
	
	
}
