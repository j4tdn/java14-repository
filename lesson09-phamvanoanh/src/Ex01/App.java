package Ex01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter length of arrays from 4 to 40 elements ");
		int length=sc.nextInt();
		if(length  < 4 || length >40) {
			System.out.println("array is out of length");
			return;
		}
		int[] arr1= new int [length];
		int[] arr2= new int [length];
		System.out.print("Enter arr1: ");
		enterArrays(arr1);
		System.out.print("Enter arr2: ");
		enterArrays(arr2);
		System.out.print("the concur elements are : ");
		int []rs= getConcurElements(arr1, arr2);
		sorted(rs);
		System.out.println(Arrays.toString(rs));
		
		
		
	}
	private static int[] getConcurElements(int [] arr1, int [] arr2) {
		int [] rs= new int [arr1.length];
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					rs[count++]=arr1[i];
				}
			}
		}
		
		return Arrays.copyOfRange(rs, 0, count);
	}
	private static void enterArrays(int []arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}

	private static void sorted(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j= i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
