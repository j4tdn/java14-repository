package ex04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Nhập số lượng số trong dãy số: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		int []array = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhập số thứ "+(i+1)+": ");
			array[i] = sc.nextInt();
		}
		int []oddNumbers = new int[n];
		int j=0;
		for(int i=0; i<n; i++) { 
			if(array[i]%2!=0) {				
				oddNumbers[j]=array[i];
				if(oddNumbers[j]>max) {
					max = oddNumbers[j];
				}
				j++;
			}
		}
		//System.out.println(oddNumbers[j]);
		//System.out.println(j);
		System.out.println("Số lẻ lớn nhất trong dãy là: "+max);
	}
}
