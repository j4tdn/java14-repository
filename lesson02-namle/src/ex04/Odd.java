package ex04;

import java.util.Scanner;

public class Odd {
	
	
	public static void inPutArray(int[] arr, int n)
	{
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = input.nextInt();
		}
		
	}
	
	public static void outPutArray(int []arr, int n)
	{
		System.out.println("result of array: ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int oddOfArray(int []arr, int n, int Max)
	{
		Max = 0;
		
		for(int i = 0 ; i < n ; i++)
		{
			if((arr[i] % 2 != 0 ) && arr[i] > Max)
			{
				Max = arr[i];
			}
		}

		return Max;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of array: ");
		
		int n  = Integer.parseInt(input.nextLine());
		int array[] = new int [n];
		inPutArray(array, n);
		outPutArray(array, n);
		System.out.println("Odd: "+ oddOfArray(array, n, 0));
		
	}

}
