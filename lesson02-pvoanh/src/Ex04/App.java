package Ex04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int []arr= new int[10];
		for(int i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(maxEvenOfArray(arr));
	}
	public static int maxEvenOfArray(int []arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(isEven(arr[i])&& arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max;
	}
	public static boolean isEven(int a) {
		return a%2!=0;
	}
}
