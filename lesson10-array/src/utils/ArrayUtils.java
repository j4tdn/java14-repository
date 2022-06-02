package utils;

public class ArrayUtils {
	private ArrayUtils() {
	}
	
	public static void printf(int[] elements) {
		for (int i : elements) {
			System.out.printf(i + " ");
		}
	}
	
	public static void swap(int a,int b) {
		int temp = a;
		a=b;
		b=a;
	}
	
}
