package bt04;

import java.util.Scanner;

public class ConvertNumber {
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
			if(x.length==2) {
				if(i==0) {
					System.out.print("mươi ");
				}
				
			}
			else if(x.length==3) {
				if(i==0) {
					System.out.print("trăm ");
				}
				else if(i==1) {
					System.out.print("mươi ");
				}
			}
			else if(x.length==4) {
				if(i==0) {
					System.out.print("nghìn ");
				}
				else if(i==1) {
					System.out.print("trăm ");
				}
				else if(i==2) {
					System.out.print("mươi ");
				}
			}
			else if(x.length==5) {
				if(i==0) {
					System.out.print("mươi ");
				}
				else if(i==1) {
					System.out.print("nghìn ");
				}
				else if(i==2) {
					System.out.print("trăm ");
				}
				else if(i==3) {
					System.out.print("mươi ");
				}
			}
			else if(x.length==6) {
				if(i==0) {
					System.out.print("trăm ");
				}
				else if(i==1) {
					System.out.print("mươi ");
				}
				else if(i==2) {
					System.out.print("nghìn ");
				}
				else if(i==3) {
					System.out.print("trăm ");
				}
				else if(i==4) {
					System.out.print("mươi ");
				}
			}
			else if(x.length==7) {
				if(i==0) {
					System.out.print("triệu ");
				}
				else if(i==1) {
					System.out.print("trăm ");
				}
				else if(i==2) {
					System.out.print("mươi ");
				}
				else if(i==3) {
					System.out.print("nghìn ");
				}
				else if(i==4) {
					System.out.print("trăm ");
				}
				else if(i==5) {
					System.out.print("mươi ");
				}
			}
			else if(x.length==8) {
				if(i==0) {
					System.out.print("mươi ");
				}
				else if(i==1) {
					System.out.print("triệu ");
				}
				else if(i==2) {
					System.out.print("trăm ");
				}
				else if(i==3) {
					System.out.print("mươi ");
				}
				else if(i==4) {
					System.out.print("nghìn ");
				}
				else if(i==5) {
					System.out.print("trăm ");
				}
				else if(i==6) {
					System.out.print("mươi ");
				}
			}
			else if(x.length==9) {
				if(i==0) {
					System.out.print("trăm ");
				}
				else if(i==1) {
					System.out.print("mươi ");
				}
				else if(i==2) {
					System.out.print("triệu ");
				}
				else if(i==3) {
					System.out.print("trăm ");
				}
				else if(i==4) {
					System.out.print("mươi ");
				}
				else if(i==5) {
					System.out.print("nghìn ");
				}
				else if(i==6) {
					System.out.print("trăm ");
				}
				else if(i==7) {
					System.out.print("mươi ");
				}
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
