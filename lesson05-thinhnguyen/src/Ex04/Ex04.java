package Ex04;

import java.util.Map;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int [n];
	}
	public static void input(int [] arr , int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập các phần tử cho mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        arr[i] = sc.nextInt();
	    }
	}
	public static void printf(int [] arr , int n) {
		for (int i = 0; i < n; i++) {
	        System.out.print(arr[i] + "\t");
	    }
	}
}
