package Ex03;

import java.util.Scanner;

public class Ex03 {
	public static String[] reverse(String s) {
		String[] strArray = s.split(" ");
		for(int i=0; i<3; i++){ 
			char[] s1 = strArray[i].toCharArray();
			for (int j = s1.length-1; j>=0; j--)
			{
				System.out.print(s1[j]);
			}
			System.out.print(" ");
		}
		return strArray;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		reverse(n);
	}		
}