package bt04;

import java.util.Scanner;

public class ConvertNumber2 {
	public static void main(String[] args) {
		System.out.println("Nhập số của bạn: ");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		readNumber(number);
	}
	
	private static void readNumber(String n) {
		char[] x = n.toCharArray() ;
		for(int i=0; i<x.length; i++) {
			number(x[i]);
			switch (x.length) {
				case 2:
					if(i==0)	
						System.out.print("mươi ");
					break;
				case 3:
					switch (i) {
					case 0:
						System.out.print("trăm ");
						break;
					case 1:
						System.out.print("mươi ");
						break;
					default:
						break;
					}
					break;
				case 4:
					switch (i) {
					case 0:
						System.out.print("nghìn ");
						break;
					case 1:
						System.out.print("trăm ");
						break;
					case 2:
						System.out.print("mươi ");
						break;
					default:
						break;
					}
					break;
				case 5:
					switch (i) {
					case 0:
						System.out.print("mươi ");
						break;
					case 1:
						System.out.print("nghìn ");
						break;
					case 2:
						System.out.print("trăm ");
						break;
					case 3:
						System.out.print("mươi ");
						break;
					default:
						break;
					}
					break;
				case 6:
					switch (i) {
					case 0:
						System.out.print("trăm ");
						break;
					case 1:
						System.out.print("mươi ");
						break;
					case 2:
						System.out.print("nghìn ");
						break;
					case 3:
						System.out.print("trăm ");
						break;
					case 4:
						System.out.print("mươi ");
						break;
					default:
						break;
					}
					break;
				case 7:
					switch (i) {
					case 0:
						System.out.print("triệu ");
						break;
					case 1:
						System.out.print("trăm ");
						break;
					case 2:
						System.out.print("mươi ");
						break;
					case 3:
						System.out.print("nghìn ");
						break;
					case 4:
						System.out.print("trăm ");
						break;
					case 5:
						System.out.print("mươi ");
						break;
					default:
						break;
					}
					break;
				case 8:
					switch (i) {
					case 0:
						System.out.print("mươi ");
						break;
					case 1:
						System.out.print("triệu ");
						break;
					case 2:
						System.out.print("trăm ");
						break;
					case 3:
						System.out.print("mươi ");
						break;
					case 4:
						System.out.print("nghìn ");
						break;
					case 5:
						System.out.print("trăm ");
						break;
					case 6:
						System.out.print("mươi ");
						break;
					default:
						break;
					}
					break;
				case 9:
					switch (i) {
					case 0:
						System.out.print("trăm ");
						break;
					case 1:
						System.out.print("mươi ");
						break;
					case 2:
						System.out.print("triệu ");
						break;
					case 3:
						System.out.print("trăm ");
						break;
					case 4:
						System.out.print("mươi ");
						break;
					case 5:
						System.out.print("nghìn ");
						break;
					case 6:
						System.out.print("trăm ");
						break;
					case 7:
						System.out.print("mươi ");
						break;
					default:
						break;
					}
					break;
				default:
					break;
			}
		}
	}

	private static void number(char x) {
		switch (x) {
			case '0': 
				System.out.print("không ");
				break;
			case '1': 
				System.out.print("một ");
				break;
			case '2': 
				System.out.print("hai ");
				break;
			case '3': 
				System.out.print("ba ");
				break;
			case '4': 
				System.out.print("bốn ");
				break;
			case '5': 
				System.out.print("năm ");
				break;
			case '6': 
				System.out.print("sáu ");
				break;
			case '7': 
				System.out.print("bảy ");
				break;
			case '8': 
				System.out.print("tám ");
				break;
			case '9': 
				System.out.print("chín ");
				break;
		}
	}
}
