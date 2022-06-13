package sorting.primitive;

import java.util.Arrays;

public class Ex02BubbleSort {
	public static void main(String[] args) {
		int [] elements= {1,5,9,11,4,6};
		sort(elements);
		System.out.println(Arrays.toString(elements));
	}
	private static void sort(int[]elemets) {
		for(int round=0;round<elemets.length;round++) {
			for(int j=0;j<elemets.length-round-1;j++) {
				if(elemets[j]<elemets[j+1]) {
					int temp=elemets[j];
					elemets[j]=elemets[j+1];
					elemets[j+1]=temp;
				}
			}
		}
	}
}
