package bt03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap: ");
		String s = sc.nextLine();
		
		String s1 = s.trim().replaceAll("\\s+", " ");
		System.out.println("Sau khi loai bo khoang trang: "+s1);
		
		
		System.out.print("Sau khi dao chuoi: ");
		String input = s1;
        StringBuilder str = new StringBuilder(input);
        System.out.println(str.reverse().toString());
	}
}
