package ex06;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(long n) {
	       if (n <= 1) {
	           return false;
	       }
	       for (int i = 2; i <= Math.sqrt(n); i++) {
	           if (n % i == 0) {
	               return false;
	           }
	       }
	       return true;
	   }
	
	public static void main(String[] args) {
		long i = 1, count = 0, number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the PrimeNumber :");
		number = Integer.parseInt(input.nextLine());
		
		while(count != number)
		{
			i++;
			if(isPrime(i) )
			{
				count ++;
			}
		}
		System.out.println("result :"+i);
		
	}	

}
