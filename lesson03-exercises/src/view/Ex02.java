package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static Scanner sc = new Scanner(System.in);
	public static Random rd = new Random();

	public static void main(String[] args) {
		System.out.println("enter matrix m*n:");
		System.out.print("enter m: ");
		int m = Integer.parseInt(sc.next());
		System.out.print("enter n: ");
		int n = Integer.parseInt(sc.next());
		int[][] A = new int[m][n];

		// random a number for each element in matrix
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = rd.nextInt(100);
			}
		}
		// print each element in matrix
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + "\t");
				if ((j + 1) % n == 0) {
					System.out.println();
				}
			}

		}
		
		int min;
	    int max;
	    int rowColumn=0;
	    int columnRow=0;
	    for(int i=0;i<m;i++) {
	    	min= A[i][0];			// gán giá trị đầu của hàng =min
	    	for(int j=0;j<n;j++) {  // duyệt theo hàng tìm min
	    		if(min <A[i][j]) {
	    			min=A[i][j];
	    			rowColumn=j;         // save column
	    		}
	    	}
	    	System.out.println("min: "+min);
	    	max=A[rowColumn][0];		// gán max = theo chỉ số của min
	    	for(int t=0;t<m;i++) {
	    		if(max > A[rowColumn][t]) {
	    			max=A[rowColumn][t];
	    			columnRow=t;
	    			
	    		}
	    	}
	    	System.out.println("max:"+max);
	    	if(min==max) {
	    		System.out.println("A["+rowColumn+"]["+columnRow+"]");
	    	}
	    }
	}
}
