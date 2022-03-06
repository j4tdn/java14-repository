package Ex02;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int row, col;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số hàng của mảng : ");
		row = scanner.nextInt();
		System.out.println("Nhập số cột của mảng : ");
		col = scanner.nextInt();
		int [][] Array = new int[row][col];
		for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
	            Array[i][j] = scanner.nextInt();
	        }
	        System.out.println("Mảng vừa nhập: ");
	        for (int i1 = 0; i1 < row; i1++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(Array[i1][j] + "\t");
	            }
	            System.out.println("\n");
	    }
	}
		double max[] = new double[10];
		double min[] = new double[10];
		for(int i = 0; i < row; i++) {
			min[i] = Array[i][0];
			for(int j=0; j < col; j++) {
				if( min[i] > Array[i][j]) {
					min[i] = Array[i][j];
				}
			}
		}
			for(int j=0; j<col; j++) {
				max[j] = Array[0][j];
				for(int i = 0; i < row; i++) {
					if( max[j] < Array[i][j]) {
						max [j]= Array[i][j];
					}
				}
			}
			for(int i=0; i< row; i++ ) {
				for(int j=0; j< row; j++ ) {
				if(Array[i][j]== min[i] && Array[i][j]==max[j]) {
					System.out.println("Số cần tìm :" + Array[i][j]);
				}
				}	
			}
		}
	}



