package ex03;

import java.util.Scanner;

public class symmetry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, checknumber = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		number = Integer.parseInt(input.nextLine());
		int temp = number;
		while (number != 0) {
			
			int digit = number % 10;
			checknumber = checknumber * 10 + digit;
			number /= 10;
		}
		if (checknumber == temp) {
			System.out.println("True");
		} 
		else {
			System.out.println("False" );
		}
	}

}
