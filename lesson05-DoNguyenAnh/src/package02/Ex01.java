package package02;

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
		for(int i = 0;i<n-2;i++) {
			System.out.printf("arr[%d] = ",i);
			arr[i] = scanner.nextInt();
		}
		// check max element in arr
		int elementMax = arr[0];
		for(int i = 1;i<n-2 ; i++) {
			if(elementMax < arr[i]) {
				elementMax = arr[i];
			}
		}
		System.out.println("Element miss in arr:" + getMissingNumber(arr, elementMax));
		
		
	}
	public static int getMissingNumber(int[] arr, int elementMax) {
		int sumElementArrFull = 0;
		for(int i = 1; i <= elementMax; i++) {
			sumElementArrFull += i;
		}
		int sumElementArrMiss = 0;
		for(int element : arr) {
			sumElementArrMiss += element;
		}
		return sumElementArrFull - sumElementArrMiss;
	}
	

}
