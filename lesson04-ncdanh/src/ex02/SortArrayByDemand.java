package ex02;

import java.util.Scanner;

public class SortArrayByDemand {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array's length value: ");
		int n = input.nextInt();
		System.out.println("Enter array's value: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("This is your array before sorting: ");
		toString(array);
		System.out.println("This is your array after sorting: ");
		toString(sortArrayByDemand(array));
	}

	private static int[] sortArrayByDemand(int[] array) {
		int frontIndex = 0;
		int backIndex = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 7 == 0 && array[i] % 5 != 0) {
				int temp = array[i];
				array[i] = array[frontIndex];
				array[frontIndex]=temp;
				frontIndex++;
			}
		}

		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] % 7 != 0 && array[i] % 5 == 0) {
				int temp = array[i];
				array[i] = array[backIndex];
				array[backIndex] = temp;
				backIndex--;
			}
		}
		return array;
	}

	private static void toString(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + " ,");
			} else {
				System.out.println(array[i]);
			}
		}
	}

}
