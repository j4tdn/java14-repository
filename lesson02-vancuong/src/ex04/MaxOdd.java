package ex04;
import java.util.Scanner;

public class MaxOdd {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		n = sc.nextInt();
		int a[] = new int[n];
		input(a, n);
		print(a, n);
		System.out.println("\nMaxOdd : " + max(a, n));
	}

	public static void input(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("Iput a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
	}

	public static void print(int a[], int n) {
		System.out.print("Element in array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int max(int a[], int n) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				max = a[i];
			}
		}
		return max;
	}
}
