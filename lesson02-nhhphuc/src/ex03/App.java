package ex03;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Nhập vào số cần kiểm tra: ");
	    int n = sc.nextInt();
	    boolean check = isSymmetricalNumber(n);
	    if(check) {
	    	System.out.println(n + "là số đối xứng");
	    }
	    else System.out.println(n + "không là số đối xứng");
	    
	}
	
	public static boolean isSymmetricalNumber(int n) {
		int i = 0, j;
	    j = n;
	    while(n != 0) {
	      int digit = n % 10;
	      i = i * 10 + digit;
	      n /= 10;
	    }
	    if(i == j)   return true;
	    else  return false;
	}
}
