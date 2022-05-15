package bt02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap chuoi:");
		System.out.print("Chuoi 1: ");
		String s1 = sc.nextLine();
		System.out.print("Chuoi 2: ");
		String s2 = sc.nextLine();
		String[] c = {s1, s2};
		System.out.println("Largest Number: ");
		show(getLargestNumbers(c));
	}
	public static String[] getLargestNumbers(String[] c) {
		String[] str = new String[c.length];
		int k = -1;
		for(int i = 0; i<c.length; i++) {
			String[] s = c[i].split("[A-Za-z]+");
			int max=0;
			for(int j = 0;j<s.length; j++) {
				if(s[j]!="") {
					int num = Integer.parseInt(s[j].toString());
					if(num>max) max = num;
				}
			}
			k++;
			str[k] = max+""; 
		}
		return str;
	}

	public static void show(String[] c) {
		for(int i = 0;i <c.length;i++) {
			if(i == c.length-1) {
				System.out.print(c[i]);
			}
			else 
				System.out.print(c[i] + ", ");
		}
	}
}