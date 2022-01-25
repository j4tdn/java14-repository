package ex02;

import java.util.Scanner;

public class Sum {
	public static int giaiThua(int n) {
		if (n == 1)
			return 1;
		return n * giaiThua(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long  sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number of array");
		int numberArray = Integer.parseInt(input.nextLine());
		int[] array = new int[numberArray];
		System.out.println("enter the array");
		for(int i = 0 ; i < numberArray ; i++)
		{
			array[i] = input.nextInt();
		}
		for(int i = 0 ; i < numberArray ; i++)
		{
			sum += giaiThua(array[i]);
		}
		
//		int sum = 7;
		System.out.println(sum);

	}

}
