package Ex04;
import java.util.Scanner;
public class Odd {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử cho mảng : ");
		n = sc.nextInt();
		int a[] = new int [n];
		input(a, n);
		print(a, n);
		System.out.println("\nSố lẻ lơn nhất là : " + max(a, n));
	}
	public static void input(int a[], int n) {
		Scanner sc = new Scanner(System.in);
	    for (int i = 0; i < n; i++) {
	    	System.out.print("Nhập a[" + i + "]: ");
	    	a[i] = sc.nextInt();
	    }
	}
	public static void print(int a[], int n) {
		System.out.print("Các phần tử trong mảng là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
	    }
	}
	public static int max(int a[], int n) {
		int max=0;
		for(int i=0 ; i < a.length ; i++) {
			if(a[i] % 2 !=0) {
				max = a[i];
			}
		}
		return max;
	}
}
