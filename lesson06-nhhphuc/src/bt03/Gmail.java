package bt03;

import java.util.Scanner;

public class Gmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String chuoi = ".ab--cd_@gmail.com";				
		do {
			System.out.println("Please enter your email: ");
			String chuoi = sc.nextLine();
			String[] words = chuoi.split("@");
			String prefix = words[0];
			String domain = words[1];
			
			//checkPrefix(prefix);
			isCloseSpecial(prefix);
			isSpecialBeforeAplha(prefix);
			isSpecialFirstLocation(prefix);
			break;
		} while (true);
	}
	
	// 1. kiem tra ky tu dung truoc @
		private static boolean isSpecialBeforeAplha(String prefix) {
			String prefix_new = prefix+'@';
			char[] x = prefix_new.toCharArray() ;
			System.out.println(x);
			
			for(int i=0; i<x.length; i++) {
				if(x[i]=='@') {
					if(x[i-1]=='.' || x[i-1]=='_' || x[i-1]=='-' ) {
						System.out.println("WRONG: Ky tu dac biet khong the dung truoc @");
						System.out.println("Vui long nhap lai");
					}
					else {
						System.out.println("");
					}
				break;
				}
			}
			return true;
		}
	
	// 2. kiem tra ky tu dung gan nhau
	private static boolean isCloseSpecial(String prefix) {
		char[] x = prefix.toCharArray();
		for(int i=0; i<x.length; i++) {
			if(x[i]=='.' || x[i]=='_' || x[i]=='-' ) {
				char tmp = x[i];
				if(tmp == x[i+1]) {
					System.out.println("WRONG: Hai ky tu dac biet khong the dung gan nhau");
					System.out.println("Vui long nhap lai");
				}
				else {
					System.out.println("");
				}
			break;
			}
		}
		return true;
	}
	
	// 3. kiem tra ky tu dac biet co dung dau tien
	private static boolean isSpecialFirstLocation(String prefix) {
		char[] x = prefix.toCharArray();
		if(x[0]=='.' || x[0]=='_' || x[0]=='-' ) {
			System.out.println("WRONG: Ky tu dac biet khong the dung dau tien");
			System.out.println("Vui long nhap lai");
		}	
		else {
			System.out.println("");
		}
		return true;
	}
	
	//kiem tra co ton tai ky tu dac biet
	private static boolean checkPrefix(String prefix) {
		if(prefix.matches(".*[._-].*")) {
			System.out.println("has");
		}
		else {
			System.out.println("no");
		}
		return true;
	}
}














