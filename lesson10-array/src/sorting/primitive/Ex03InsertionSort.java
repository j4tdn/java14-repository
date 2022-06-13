package sorting.primitive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int []elements= {4,3,2,10,12,1,5,6};
		sort(elements);
		ArrayUtils.printf(elements);
	
	}
	private static void sort(int [] elements) {
		for(int i=1;i<elements.length;i++) {
			for(int j=0;j<i;j++) {
				if(elements[i]<elements[j]) {
					int temp=elements[i];
					elements[i]=elements[j];
					elements[j]=temp;
				}
			}
		}
	}
}
