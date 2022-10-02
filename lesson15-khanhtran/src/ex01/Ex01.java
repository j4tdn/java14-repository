package ex01;

import java.util.function.Predicate;

public class Ex01 {
	public static void main(String[] args) {
		int[] tmp = {1, 2, 5, 6, 7, 8, 2, 1, 4, 9, 6, 7, 3};
		
		// Liet ke so khong trung
		printNumber(tmp, true);
		System.out.println();
		// Liet ke so trung
		printNumber(tmp, false);
	}
	
	public static void printNumber(int[] ip, boolean isDuplicate) {
		boolean[] check = new boolean[ip.length];
		for(int i=0; i< ip.length; i++) {
			if(check[i]) continue;
			for(int j = i+1; j<ip.length; j++)
				if(ip[i] == ip[j]) check[i] = check[j] = true;
			if(check[i] == !isDuplicate) System.out.print(ip[i] + " ");
		}
	}
	
}
