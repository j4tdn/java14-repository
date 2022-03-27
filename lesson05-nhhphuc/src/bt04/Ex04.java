package bt04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
	    int[] mangNguyen = new int[10];
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Nhap 10 so nguyen bat ky:");
	    for (int i = 0; i < mangNguyen.length; i++) {
	        System.out.printf("Phan tu thu: ", i + 1);
	        mangNguyen[i] = scanner.nextInt();
	    }
	    int[] trungGian = new int[10];
	    boolean timThay;
	    int count = 0;
	    trungGian[0] = mangNguyen[0];
	    count++;
	    for (int i = 1; i < mangNguyen.length; i++) {
	        timThay = false;
	        for (int j = 0; j < count; j++) {
	            if (trungGian[j] == mangNguyen[i]) {
	            timThay = true;
	            break;
	          }
	      }
	      if (!timThay) {
	          trungGian[count] = mangNguyen[i];
	          count++;
	        }
	    }
	    
	    for (int i = 0; i < mangNguyen.length; i++) {
	        mangNguyen[i] = trungGian[i];
	    }
	    
	    System.out.println("Result: ");
	    for (int i : mangNguyen) {
	         System.out.println(i);
	    }
	}

}
