package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class IndexCommon {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("enter the number :");
//		int n = Integer.parseInt(input.nextLine());
//		System.out.println("enter array");
		int[] Array1 = { 1, 4, 10, 2, 6, 7, 5 };
		int[] Array2 = { 4, 2, 9, 8, 10, 7, 15 };
		
		System.out.println(Arrays.toString(checkArray(Array1,Array2)));
		

	}
	
	private static int [] checkArray(int Array1[], int Array2[])
	{
		int[] b = new int[Array1.length];
		int count = 0;
		for (int i = 0; i < Array1.length-1; i++) {
			for (int j =0; j < Array1.length; j++) {
				if (Array1[i] == Array2[j]) {
					b[count++] = Array1[i];
				}
			}
		}
		return Arrays.copyOfRange(b, 0, count);
	}
}
