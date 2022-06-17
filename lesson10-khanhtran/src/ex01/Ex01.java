package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] ip = {1,2,3,6,2,4,1,5,8,9,3};
		//int[] test = cardino(ip);
		//print(test);
		compareHalfArray(ip);
	}
	private static void print(int[] elements) {
		for(int i=0; i<elements.length; i++) {
			System.out.print(elements[i] + " ");
		}
	}
	private static int[] cardino(int[] elements) {
		int[] tmp = new int[elements.length];
		boolean[] check = new boolean[elements.length];
		int run=0;
		
		for(int i=0; i<elements.length-1; i++) {
			if(check[i]!=true) {
				tmp[run++] = elements[i];
			}
			for(int j=i+1; j<elements.length; j++) {
				if(elements[i] == elements[j]) {
					check[i] = true;
					check[j] = true;
				}
			}			
		}
		return Arrays.copyOfRange(tmp, 0, run);
	}
	
	private static void compareHalfArray(int[] elements) {
		int first = 0;
		int last = 0;
		for(int i=0; i<=elements.length/2; i++) {
			int j=elements.length-1-i;
			first += elements[i];
			last += elements[j];
		}
		System.out.println("First: " +  first);
		System.out.println("Last: " +  last);
		if(first > last)
			System.out.println("Half First > Half Last");
		else if (first == last)
			System.out.println("Half First = Half Last");
		else
			System.out.println("Half First < Half Last");
	}
}
