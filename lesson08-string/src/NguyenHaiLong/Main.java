package NguyenHaiLong;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	private static void menuhethong() {
		System.out.println("1/ Hien thi phieu nhap");
		System.out.println("2/ Them phieu nhap");
		System.out.println("3/ Xoa phieu nhap");
		System.out.println("4/ Cap nhat ngay nhapj phieu");
	}
	public static void main(String[] args) {
		PhieuNhapHangThemSuaXoa p= new PhieuNhapHangThemSuaXoa();
		while(true) {
			menuhethong();
			int chonlua= new Scanner(System.in).nextInt();
			switch (chonlua) {
			case 1:{
				p.HienThiPhieuNhap();
				break;
			}
			case 2:{
				p.ThemPhieuNhap();
				break;
			}
			case 3:{
				System.out.print("nhap ma phieu can xoa: ");
				int id= new Scanner(System.in).nextInt();
				p.XoaPhieuNhap(id);
				break;
			}
			case 4:{
				System.out.print("nhap ma phieu can cap nhap");
				int id=new Scanner(System.in).nextInt();
				p.CapNhatPhieuNhap(id, LocalDate.now());
				break;
			}
		}
	}
}
}
