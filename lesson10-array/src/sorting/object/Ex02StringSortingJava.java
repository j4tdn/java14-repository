package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;

public class Ex02StringSortingJava {
	public static void main(String[] args) {
		String []sequences= {"1","0","x",null,"a","b","10",null,"2"};
		
//		Arrays.sort(Object[]); -> Object is Comparable
//		-> overide CompareTo
//		Arrays.sort(T[],Comparator<T>);
//     -> Object is normal class. ASC|DESC checknull-> handle in Comparator
		//Arrays.sort(sequences);
		
		Arrays.sort(sequences,new Comparator<String>() {
			// o1:before
			// o2: after
			@Override
			public int compare(String o1, String o2) {
				// null first
//				if(o2==null && o1!=null) {
//					return 1;
//				}
//				if(o1==null) {
//					return -1;
//				}
				
				// null last
				if(o2==null) {
					return -1;
				}
				if(o1==null) {
					return 1;
				}
				return o2.compareTo(o1) ;
			}
		});
		ArrayUtils.printf(sequences);
	}
}
