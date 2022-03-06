package ex02;

import java.util.Random;
import java.util.Scanner;

public class Saddle {
	public static void main(String[] args) {
		int m, n;
		System.out.println("enter the Matrix");
		System.out.println("enter the m");
		Scanner input = new Scanner(System.in);
		m = Integer.parseInt(input.nextLine());
		System.out.println("enter the n");
		n = Integer.parseInt(input.nextLine());
		int Array[][] = new int[m][n];
		Random ran = new Random();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				Array[i][j] = ran.nextInt(99) + 1;
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
		
		int Min = 0;
		int Max = 0;
		int y = 0;

		for (int i = 0; i < m; i++) {
			 Min = Array[i][0];
			
			for (int j = 1; j < n; j++) {

				if (Array[i][j] >  Min) {
					Min = Array[i][j];
					y = j;
				}

			}
			
//				 Min = Array[i][0];
		
				 for (int h = 0; h < n; h++) {
					 Max = Array[y][h];
						if (Min < Array[h][y]) {
							Max = Array[h][y];
						}

					}

		
//			 Min = Max;
		}
			
		
//		
			
		for(int j =0; j< n; j++ ) {
			for(int k=0; k< n; k++ ) {
			if(Array[j][k]== Min && Array[j][k]==Max) {
				System.out.println("the number of horseSaddle:" + Array[j][k]);
			}
			}	
		}
	}
	
}
