package bai1;

public class Sinhvien {
	private String maSinhvien;
	private String hovaten;
	private float xeploai;
	public Sinhvien(String maSinhvien, String hovaten, float xeploai) {
		super();
		this.maSinhvien = maSinhvien;
		this.hovaten = hovaten;
		this.xeploai = xeploai;
	}
	@Override
	public String toString() {
		return "Ex01 [maSinhvien=" + maSinhvien + ", hovaten=" + hovaten + ", xeploai=" + xeploai + "]";
	}
	public String getMaSinhvien() {
		return maSinhvien;
	}
	public void setMaSinhvien(String maSinhvien) {
		this.maSinhvien = maSinhvien;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public float getXeploai() {
		return xeploai;
	}
	public void setXeploai(float xeploai) {
		this.xeploai = xeploai;
	} 
}
 