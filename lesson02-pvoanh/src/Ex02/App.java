package Ex02;

import java.util.Scanner;

public class App {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter number of element: ");
		int e=sc.nextInt();
		int[]arr= new int[e];
		for(int i=0;i<e;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("sum of each elements factorial is :"+sumOfEachElementFactorial(arr));
	}
	public static long sumOfEachElementFactorial(int []arr) {
		long sum=0;
		for(int i:arr) {
			sum+=factorial(i);
		}
		return sum;
	}
	public static long factorial(int a) {
		long gt=1;
		for(int i =1;i<=a;i++) {
			gt*=i;
		}
		return gt;
	}
}
