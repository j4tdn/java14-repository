package bai5;

public class Customer {
private String makhachhang;
private String hoten;
private String sdt;
private String diachi;
public Customer(String makhachhang, String hoten, String sdt, String diachi) {
	super();
	this.makhachhang = makhachhang;
	this.hoten = hoten;
	this.sdt = sdt;
	this.diachi = diachi;
}
public String getMakhachhang() {
	return makhachhang;
}
public void setMakhachhang(String makhachhang) {
	this.makhachhang = makhachhang;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getSdt() {
	return sdt;
}
public void setSdt(String sdt) {
	this.sdt = sdt;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
@Override
public String toString() {
	return "Customer [makhachhang=" + makhachhang + ", hoten=" + hoten + ", sdt=" + sdt + ", diachi=" + diachi + "]";
}

}
