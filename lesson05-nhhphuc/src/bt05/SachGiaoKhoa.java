package bt05;

public class SachGiaoKhoa {
	private String id;
	private double donGia;
	private String nXB;
	private String tinhTrang;
	public SachGiaoKhoa(String id, double donGia, String nXB, String tinhTrang) {
		this.id = id;
		this.donGia = donGia;
		this.nXB = nXB;
		this.tinhTrang = tinhTrang;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getnXB() {
		return nXB;
	}
	public void setnXB(String nXB) {
		this.nXB = nXB;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
	
}
