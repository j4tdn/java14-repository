package bt03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[1000];
	    int n;
	    System.out.println("Nhap vao n: ");
	    n = sc.nextInt();
	    NhapMang(a,n);
	    System.out.println("BCNN: " + BCNN_Mang(a,n));
	}
	
	public static int UCLN(int a, int b){
	    if(a==b) return a;
	    if(a>b) 
	        return UCLN(a-b,b);
	    else
	        return UCLN(a,b-a);
	}
	
	public static int BCNN(int a, int b){
	    return (a*b/UCLN(a,b) );
	}
	
	public static void NhapMang(int a[],int n){
	    for(int i=0;i<n;i++){
	    	System.out.println("Nhap a["+i+"]");
	        Scanner sc = new Scanner(System.in);
	        a[i] = sc.nextInt();    
	    }
	}
	
	public static int BCNN_Mang(int a[],int n){
	    int temp = BCNN(a[0], a[1] );
	    for(int i=2;i<n;i++){
	        temp = BCNN(temp, a[i]);    
	    }
	    return temp;
	}
}
