package ex01;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;

	public Vehicle() {

	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public double tinhThue() {
		double thue;
		if (dungTich < 100)
			thue = triGia * 0.01;
		else if (dungTich >= 100 && dungTich <= 200)
			thue = triGia * 0.03;
		else
			thue = triGia * 0.05;
		return thue;
	}

	@Override
	public String toString() {
		return tenChuXe + "-" + loaiXe + "-" + dungTich + "-" + triGia;
	}

	void inThue() {
		System.out.printf("%10s %10s %10d %10.2f %8.5f \n ", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
	}
}
