package matrix;

import java.util.Random;

import javax.naming.ldap.Rdn;

public class HorseSaddle {
	private static Random rd = new Random();
    public static void main(String[] args) {
		int[][] a = initialMatrix(2, 3);
		printMatrix(a);
		System.out.println(horseSaddle(a));
		
	}
    
    public static int[][] initialMatrix(int column, int row) {
    	int[][] result = new int[column][row];
    	for(int i = 0; i < column; i++) {
    		for(int j = 0; j < row; j++) {
    			result[i][j] = rd.nextInt(99) + 1;
    		}
    	}
    	return result;
    }
    public static void printMatrix(int[][] matrix) {
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[i].length; j++) {
    			System.out.print(matrix[i][j] + "  ");
    		}
    		System.out.println("\n");
    	}
    }
    public static boolean horseSaddle(int[][] matrix) {
    	for(int j = 0; j < matrix.length; j++) {
    		int minColumn = matrix[j][0];
    		int tempPos = 0;
    		for(int i = 0; i < matrix[0].length; i++) {
    			if(matrix[j][i] < minColumn) {
    				minColumn = matrix[j][i];
    				tempPos = i;
    			}
    		}
    		
    		for(int k = 0; k<matrix.length; k++) {
    			if (matrix[k][tempPos] > minColumn) {
    				tempPos = -1;
    				break;
    			}
    		}
    		if(tempPos != -1) {
    			return true;
    		}
    	}
    	return false;
    }
}
