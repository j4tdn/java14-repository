package taiXiu;

import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 10000;
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		do {
			System.out.println("Moi Ban Lua Chon");
			System.out.println("1.Chon (1) Tiep Tuc Choi");
			System.out.println("2.Thoat (2) de thoat ");
			luaChon = sc.nextInt();
			if(luaChon==1) {
				System.out.println("Bat dau choi");
				System.out.println("Tai Khoan cua ban : " + taiKhoanNguoiChoi);
				double datCuoc=0;
				do{
					System.out.println("Ban muon dat cuoc bao nhieu : ");
					datCuoc = sc.nextDouble();
				}while(datCuoc <=0 || datCuoc > taiKhoanNguoiChoi);
				int luaChonTaiXiu = 0;
				// chon tai xiu
				do{
					System.out.println("Chon (1) la tai || chon (2) la xiu");
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu !=1 && luaChonTaiXiu !=2);
				
				Random xucXac = new Random();
		
				int giaTri1 = xucXac.nextInt(5)+1;
				int giaTri2 = xucXac.nextInt(5)+1;
				int giaTri3 = xucXac.nextInt(5)+1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				System.out.println("Ket qua: " + giaTri1 + " - " +giaTri2+ " - " + giaTri3);
				if(tong == 3){
					if(luaChonTaiXiu == 2) {
						System.out.println("Tong la " + tong);
						System.out.println("Chuc mung ban da no hu");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("Tai khoan cua ban : " + taiKhoanNguoiChoi);
					}else {
						System.out.println("Tong la " + tong);
						System.out.println("Ban da thua");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("Tai khoan cua ban : " + taiKhoanNguoiChoi);
					}
				}else if(tong == 18) {
					if(luaChonTaiXiu == 1) {
						System.out.println("Tong la " + tong);
						System.out.println("Chuc mung ban da no hu");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("Tai khoan cua ban : " + taiKhoanNguoiChoi);
					}else {
						System.out.println("Tong la " + tong);
						System.out.println("Ban da thua");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("Tai khoan cua ban : " + taiKhoanNguoiChoi);
					}
				}else if(tong >= 4 && tong <= 10) {
					if(luaChonTaiXiu == 2) {
						System.out.println("Tong la " + tong);
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("Tai khoan cua ban : " + taiKhoanNguoiChoi);
					}else {
						System.out.println("Tong la " + tong);
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("Tai khoan cua ban : " + taiKhoanNguoiChoi);
					}
				}else{
					if(luaChonTaiXiu == 1) {
						System.out.println("Tong la " + tong);
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("Tai khoan cua ban : " + taiKhoanNguoiChoi);
					}else {
						System.out.println("Tong la " + tong);
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("Tai khoan cua ban : " + taiKhoanNguoiChoi);
					}
				}
			}
		}while(luaChon!=1);
	}
}
