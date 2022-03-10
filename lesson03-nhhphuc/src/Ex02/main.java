package Ex02;


import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,j,n,m,a[][],kt=0;
	    nhaplai:
	    System.out.println("Nhap so hang va so cot cua ma tran :  ");
	    n = Integer.parseInt(sc.next());
	    m = Integer.parseInt(sc.next());
	    for (i=0;i<n;i++)
		    for (j=0;j<m;j++)
		    {
		    	System.out.println("A[i][j]"+a[i][j]);
		    }
	    for (i=0;i<n;i++)
	    {    
	         for (j=0;j<m;j++)
	         if (a[i][j]==timmin(a,i,m) && a[i][j] == timmax(a,n,j))  
	            {
	        	 System.out.println("A[%d][%d] = "+a[i][j]+" la mot diem yen ngua \n");
	               kt++;
	            }
	    }
	    if (kt==0) 
	    	System.out.println("\n Khong co diem yen ngua nao ");
	}
	

	public int timmin(int a[][], int sh, int sc)
	{
	    int k, min=a[sh][0];
	    for (k=1;k<sc;k++)  if (a[sh][k]<min)   min = a[sh][k];
	    return min;
	}
	public int timmax(int a[][], int sh, int sc)
	{
	    int k, max=a[0][sc];
	    for (k=1;k<sh;k++)  if (a[k][sc]>max)   max = a[k][sc];
	    return max;
	}
}
