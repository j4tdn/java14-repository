package package03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size arr");
		n = scanner.nextInt();
        // create arr
		int []arr = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i = 0;i<n;i++) {
			System.out.printf("arr[%d] = ",i);
			arr[i] = scanner.nextInt();
		}
		long res;
		for(int i = 0; i< n;i++) {
			res = getLeastCommonMultiple(arr[i],arr[++i]);
		}
	}

	public static int getLeastCommonMultiple(int numberCurent, int numberNext) {
		int gcd = 0;
		for (int i = 1; i < numberCurent && i < numberNext; i++) {
           if(numberCurent % i == 0 && numberNext % i == 0) {
        	   gcd = i;
        	   
           }
		}
		int result = 0;
		result = (numberCurent*numberNext)/gcd;		
		return result;
	}
	
}
