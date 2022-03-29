package package03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
			int n;
			System.out.println("input n");
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			
			int a[] = new int [n+2];
			int b[] = new int [n+2];
			for(int i=0;i<n;i++) {   //hang 1: 1 1 0 0 0 ...
				a[i]=1;b[i]=1;        //mang b: 1 1 1 1 1 ...
				if(i>1) a[i]=0;
			}
			
			for(int i=1;i<=n;i++)
			{
				for(int h=0;h<i+1;h++)
			    {
				    System.out.print(a[h] + " ");
		     	}
		     	System.out.println();
		     	
				for(int j=1;j<i+1;j++)
				{
					b[j]=a[j-1]+a[j];     
					
				}
				b[i+1] = 1;  
				for(int k=0;k<=i+1;k++){     //cap nhat lai mang a.
					a[k]=b[k];                
				}

			}
			
			
	}		
}
