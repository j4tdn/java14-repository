package view;

import java.util.Scanner;

import bean.Matrix;

public class Ex02FindSaddlePointApp {

	public static void main(String[] args) {
		int M;
		int N;
		System.out.println("Enter matrix size: ");
		Scanner input = new Scanner(System.in);
		System.out.println("row value = ");
		M = input.nextInt();
		System.out.println("column value = ");
		N = input.nextInt();
		
		Matrix matrix = new Matrix(M, N);
		int[][] matrixArr =new int[matrix.getRow()][matrix.getColumn()];
		matrixArr = initialMatrix(matrix);
		findSaddlePoint(matrixArr, matrix);
	}
	
	public static int[][] initialMatrix(Matrix matrix) {
		int[][] matrixArr = new int[matrix.getRow()][matrix.getColumn()];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix elements: ");
		for(int i=0; i<matrix.getRow(); i++) {
			for (int j =0; j<matrix.getColumn(); j++) {
				matrixArr[i][j] = input.nextInt();
			}
		}
		return matrixArr;
	}

	public static void findSaddlePoint(int[][] array, Matrix matrix) {
		for(int i =0; i<matrix.getRow();i++) {
			boolean checkvalue = true;
			int columnIndex = 0;
			int minValue = array[i][0];
			for(int j=0; j<matrix.getColumn();j++) {
				if(minValue>array[i][j]) {
					minValue=array[i][j];
					columnIndex = j;
				}
			}
			
			for(int j =0; j< matrix.getColumn(); j++ ) {
				if(minValue<array[j][columnIndex]) {
					checkvalue = false;
					break;
				}
			}
			
			if(checkvalue) {
				System.out.println("The saddle point of the matrix is: "+minValue);
			}
		}
		
		
	}
}
