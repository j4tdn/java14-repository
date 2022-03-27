package Ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int [n];
		input(arr, n);
	    System.out.println("Phần tử cần tìm có giá trị : " + getMissingNo(arr, n));
	  
	}
	
	public static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total += i;
            total -= a[i - 2];
        }
        return total;
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
