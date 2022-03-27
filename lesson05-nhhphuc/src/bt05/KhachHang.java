package bt05;

public class KhachHang {
	private int id;
	private String hoTen;
	private double std;
	private String diaChi;
	
	public KhachHang(int id, String hoTen, int std, String diaChi) {
		this.id = id;
		this.hoTen = hoTen;
		this.std = std;
		this.diaChi = diaChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getStd() {
		return std;
	}

	public void setStd(double std) {
		this.std = std;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
	
}
