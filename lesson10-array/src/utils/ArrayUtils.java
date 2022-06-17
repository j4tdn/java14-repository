package utils;

import bean.Item;

public class ArrayUtils {
	private ArrayUtils() {
	}

	public static void printf(Item[] items) {
		for (Item item : items) {
			System.out.println(item);
		}
	}
	
	public static void printf(int[] elements) {
		for (int i : elements) {
			System.out.printf(i + " ");
		}
	}
	
	public static void printf(String[] elements) {
		for (String element : elements) {
			System.out.printf(element + " ");
		}
	}
	
	

	public static void swap(int[] elements, int a, int b) {
		int temp = elements[a];
		elements[a] = elements[b];
		elements[b] = temp;
	}

	
	public static void swap(String[] elements, int a, int b) {
		String temp = elements[a];
		elements[a] = elements[b];
		elements[b] = temp;
	}
	
	public static void reverse(int[] elements) {
		int length = elements.length-1;
		for (int i = 0; i < elements.length/ 2; i++) {
			int temp = elements[i];
			elements[i] = elements[length - i];
			elements[length - i] = temp;
		}
	}
}
