package package02;

import java.util.Random;
import java.util.Scanner;

public class GetMissingNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = input.nextInt();
		int[] checkArr = new int[n - 1];
		checkArr = initiateArray(n);
		int number = getMissingNumber(checkArr);
		System.out.println("The missing number is: " + number);
	}

	private static int[] initiateArray(int n) {
		int[] arr = new int[n];

		// initiate array arr[] with n elements
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		Random rand = new Random();

		// make elements arr[i] run randomly
		for (int i = 0; i < n; i++) {
			int randomIndex = rand.nextInt(n);
			int temp = arr[randomIndex];
			arr[randomIndex] = arr[i];
			arr[i] = temp;
		}

		// initiate new array checkArr[] with n-1 elements
		int[] checkArr = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			checkArr[i] = arr[i];
		}
		return checkArr;
	}

	private static int getMissingNumber(int checkArr[]) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= checkArr.length + 1; i++) {
			sum1 += i;
		}

		for (int i = 0; i < checkArr.length; i++) {
			sum2 += checkArr[i];
		}
		return sum1 - sum2;
	}

}
