package utils;

import bean.Item;

public class ArrayUtils {
private ArrayUtils() {
		
	}
	
	public static void printf(int[] elements) {
		for (int element: elements) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}
	public static void printf(Item[] elements) {
		for (Item element: elements) {
			System.out.println(element );
		}
		System.out.println();
	}
	public static void printf(Object[] elements) {
		for (Object element: elements) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}
	
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
	public static void reverse(int []elements) {
		for(int i=0;i<elements.length/2;i++) {
			int temp=elements[i];
			elements[i]=elements[elements.length-1-i];
			elements[elements.length-1-i]=temp;
		}
	}
}
