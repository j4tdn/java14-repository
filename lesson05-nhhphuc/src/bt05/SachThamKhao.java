package bt05;

public class SachThamKhao {
	private String id;
	private double donGia;
	private String nXB;
	private double thue;
	public SachThamKhao(String id, double donGia, String nXB, double thue) {
		super();
		this.id = id;
		this.donGia = donGia;
		this.nXB = nXB;
		this.thue = thue;
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
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	
	
}
