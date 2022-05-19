package lesson09_kt;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[];
		int n;
		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = sc.nextInt();
		} while (n < 4 || n > 19);
		a = new int[n];
		input(a,n);
		System.out.println("Mang sau khi nhập");
		prinf(a,n);
		System.out.println("Mang sau khi sắp xếp tăng dần");
		sort(a,n);
		prinf(a, n);
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
	public static void sort(int a[], int n){
	    int tg;
	    for(int i = 0; i < n - 1; i++){
	        for(int j = i + 1; j < n; j++){
	            if(a[i] > a[j]){
	                tg = a[i];
	                a[i] = a[j];
	                a[j] = tg;        
	            }
	        }
	    }
	}
	    
}
