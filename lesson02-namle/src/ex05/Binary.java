package ex05;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number :");
		number = Integer.parseInt(input.nextLine());

		int binary[] = new int[number];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
		
	}

}
