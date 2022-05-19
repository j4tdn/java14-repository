package NguyenHaiLong;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhieuNhapHangThemSuaXoa {
	private static List<PhieuNhapHang> phieunhap;
	private static Scanner sc= new Scanner(System.in);
	static {
		phieunhap= new ArrayList<PhieuNhapHang>();
	}
	public void ThemPhieuNhap() {
		System.out.print("nhap ma phieu:");
		int mp=sc.nextInt();
		System.out.print("nhap nguoi lap: ");
		String nguoilap=sc.next();
		LocalDate ngaylap=LocalDate.now();
		System.out.print("nhap so luong mat hang: ");
		int sl=sc.nextInt();
		List<MatHang> mh= new ArrayList<MatHang>();
		for(int i=0;i<sl;i++) {
			System.out.println("nhap ma mh: ");
			int mamh=sc.nextInt();
			System.out.println("nhap ten mh: ");
			String tenmh=sc.next();
			System.out.println("nhap so luong: ");
			int soluong=sc.nextInt();
			System.out.println("nhap gia");
			double gia=sc.nextDouble();
			mh.add(new MatHang(mamh, tenmh, sl, gia));
		}
		phieunhap.add(new PhieuNhapHang(mp, nguoilap, ngaylap, mh));
	}
	public void XoaPhieuNhap(int id) {
		for(PhieuNhapHang p:phieunhap) {
			if(p.getMaPhieu()==id) {
				phieunhap.remove(p);
				return;
			}
		}
	}
	public void CapNhatPhieuNhap(int id, LocalDate ld) {
		for(PhieuNhapHang p:phieunhap) {
			if(p.getMaPhieu()==id) {
				p.setNgayLap(ld);
			}
		}
	}
	public void HienThiPhieuNhap() {
		phieunhap.forEach(System.out::println);
	}
}
