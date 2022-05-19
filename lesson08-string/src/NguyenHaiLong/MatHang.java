package NguyenHaiLong;

public class MatHang {
	private int maMH;
	private String tenMH;
	private int sl;
	private double gia;
	@Override
	public String toString() {
		return "MatHang [maMH=" + maMH + ", tenMH=" + tenMH + ", sl=" + sl + ", gia=" + gia + "]";
	}
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public String getTenMH() {
		return tenMH;
	}
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public MatHang(int maMH, String tenMH, int sl, double gia) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.sl = sl;
		this.gia = gia;
	}
	public MatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
}
