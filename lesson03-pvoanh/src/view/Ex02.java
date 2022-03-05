package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd= new Random();
		int m,n;
		System.out.println("enter matrix m*n");
		System.out.print("enter m: ");
		m=Integer.parseInt(sc.next());
		System.out.print("enter n: ");
		n= Integer.parseInt(sc.next());
		int [][] A= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				A[i][j]=rd.nextInt(100);
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A[i][j]+"\t");
				if((j+1)%n==0) {
					System.out.println();
				}
				
			}
		}
		
		// solve
		int min,max, saveColumn=0;
		for(int i=0;i<m;i++) {
			min=A[i][0];			
			for(int j=1;j<n;j++) {
				if(min < A[i][j]) {
					min=A[i][j];
					saveColumn=j;   // save column have min value in Row
				}
			}
			max=A[i][saveColumn];
			for(int h=0;h<m;h++) {
				if(min > A[h][saveColumn]) {
					max= A[h][saveColumn];
				}
			}
			if(max==min) {
				System.out.println(min);
			}
		}
	}
}
 