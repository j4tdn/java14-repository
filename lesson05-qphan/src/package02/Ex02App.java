package package02;

import java.util.Random;

public class Ex02App {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		int n = 10;
		// Tạo mảng bất kỳ
		int[] elements = randomElements(n-1);
		
		int sumOfAllElements = 0;
		for (int i = 1; i <= n; i++) {
			sumOfAllElements += i;
		}
		System.out.println("sumOfAllElements: " + sumOfAllElements);
		
		int sumOfMissingElements = 0;
		for (int element: elements) {
			sumOfMissingElements += element;
		}
		System.out.println("sumOfMissingElements: " + sumOfMissingElements);
		
		System.out.println("Missing Element: " + (sumOfAllElements - sumOfMissingElements));
	}
	
	// n = 9
	private static int[] randomElements(int n) {
		int[] uniqueElements = new int[n];
		int count = 0;
		while(count < n) {
			int rand = 1 + rd.nextInt(n+1);
			if (contains(uniqueElements, rand)) {
				continue;
			}
			uniqueElements[count++] = rand;
		}
		return uniqueElements;
	}
	
	private static boolean contains(int[] elements, int input) {
		for (int element: elements) {
			if (element == input) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
