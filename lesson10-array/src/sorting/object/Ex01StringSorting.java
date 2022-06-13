package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;

public class Ex01StringSorting {
	public static void main(String[] args) {
		String []sequences= {"1","0",null,"x","a","b",null,"10","2"};
		sortNullLast(sequences);
		ArrayUtils.printf(sequences);
		
		
	}
	private static void sort(String [] elements) {
		for(int round=elements.length-1;round>0;round--) {
			for(int i=0;i<round;i++) {
				if(elements[i].compareTo(elements[round])>0) {
					String temp=elements[i];
					elements[i]=elements[round];
					elements[round]=temp;
				}
			}
		}
	}
	private static void sortNullFirst(String []elements) {
		for(int round=elements.length-1;round>0;round--) {
			for(int i=0;i<round;i++) {
				if(elements[round]==null && elements[i] !=null) {
					String temp=elements[i];
					elements[i]=elements[round];
					elements[round]=temp;
					continue;
				}
				if(elements[i]==null) {
					continue;
				}
				if(elements[i].compareTo(elements[round])>0) {
					String temp=elements[i];
					elements[i]=elements[round];
					elements[round]=temp;
				}
			}
		}
	}
	private static void sortNullLast(String []elements) {
		for(int round=elements.length-1;round>0;round--) {
			if(elements[round]==null) {
				continue;
			}
			for(int i=0;i<round;i++) {
				if(elements[i]==null) {
					String temp=elements[i];
					elements[i]=elements[round];
					elements[round]=temp;
					break;
				}
				if(elements[i].compareTo(elements[round])>0) {
					String temp=elements[i];
					elements[i]=elements[round];
					elements[round]=temp;
				}
			}
		}
	}
}
