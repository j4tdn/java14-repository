package package02;

import java.util.Scanner;

public class getMissingNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = input.nextInt();
		int[] arr = new int[n-1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = i;
			i++;
		}
		
		Random rand = new random();
		
	}

}
