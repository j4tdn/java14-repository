package lesson09_kt;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[],b[];
		int n, m ;
		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = sc.nextInt();
		} while (n < 5 || n > 39);
		a = new int[n];
		b = new int[n];
		System.out.println("Nhap mang A : ");
		input(a,n);
		System.out.println("Mang A sau khi nhập: ");
		prinf(a, n);
		System.out.println("Nhap mang B : ");
		input(b, n);
		System.out.println("Mang B sau khi nhập: ");
		prinf(b, n);
		System.out.println("Phan tu chung cua 2 mang la : ");
		printUnion(a, b, n);
	}
	public static void input(int a[], int n){
		Scanner sc = new Scanner(System.in);
	    for(int i = 0; i < n; i++){
	        System.out.println("\nNhap phan tu thu " + i + " : ");
	        a[i] = sc.nextInt();
	    }
	}
	 
	public static void prinf(int a[], int n){
	    for(int i = 0; i < n; i++){
	    	System.out.print(a[i] + " ");
	    }
	    System.out.println("");
	}
	 public static void printUnion(int[] A, int[] B, int n) {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (A[i] == B[j])
	                    System.out.print(A[i] + " ");
	            }
	        }
	    }
}
