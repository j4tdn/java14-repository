package Ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int [n];
		input(arr, n);
		System.out.println("BCNN : " + BCNN_Mang(arr, n));
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
	
	public static int UCLN(int a, int b){
	    if(a==b) return a;
	    if(a>b) 
	        UCLN(a-b,b);
	    else
	        UCLN(a,b-a);
	    return b;
	}
	public static int BCNN(int a, int b){
	    return (a*b/UCLN(a,b) );
	}
	public static int BCNN_Mang(int a[],int n){
        int temp = BCNN(a[0], a[1] );
        for(int i=2;i<n;i++){
            temp = BCNN(temp, a[i]);    
        }
        return temp;
    }
}
