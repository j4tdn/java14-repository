package Ex06;

import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n : ");
		n = sc.nextInt();
		if(isPrime(n)==true) {
			System.out.println(" Là số nguyên tố");
		}
		else {
			System.out.println(" Không phải là số nguyên tố");
		}
		
	}
	
}
