package NguyenHaiLong;

import java.time.LocalDate;
import java.util.List;

public class PhieuNhapHang {
	private int maPhieu;
	private String nguoiLap;
	private LocalDate ngayLap;
	private List<MatHang> mh;
	@Override
	public String toString() {
		return "PhieuNhapHang [maPhieu=" + maPhieu + ", nguoiLap=" + nguoiLap + ", ngayLap=" + ngayLap + ", mh=" + mh
				+ "]";
	}
	public int getMaPhieu() {
		return maPhieu;
	}
	public void setMaPhieu(int maPhieu) {
		this.maPhieu = maPhieu;
	}
	public String getNguoiLap() {
		return nguoiLap;
	}
	public void setNguoiLap(String nguoiLap) {
		this.nguoiLap = nguoiLap;
	}
	public LocalDate getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}
	public List<MatHang> getMh() {
		return mh;
	}
	public void setMh(List<MatHang> mh) {
		this.mh = mh;
	}
	public PhieuNhapHang(int maPhieu, String nguoiLap, LocalDate ngayLap, List<MatHang> mh) {
		super();
		this.maPhieu = maPhieu;
		this.nguoiLap = nguoiLap;
		this.ngayLap = ngayLap;
		this.mh = mh;
	}
	public PhieuNhapHang() {
		super();
		// TODO Auto-generated constructor stub
	}
}
