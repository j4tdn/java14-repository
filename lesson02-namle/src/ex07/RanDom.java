package ex07;

import java.util.Random;
import java.util.Scanner;

public class RanDom {
	public static void main(String[] args) {
		
		int Min , Max  ;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the min number: ");
		Min = Integer.parseInt(input.nextLine());
		System.out.println("enter the max number: ");
		Max = Integer.parseInt(input.nextLine());
		
		int about = Max - Min + 1;
		int result =0 ;
		Random rand = new Random();
		for (int i=0; i<5; i++) {
           result = Min + rand.nextInt(about);
           System.out.println(result);
			
        }
		

	}
}
